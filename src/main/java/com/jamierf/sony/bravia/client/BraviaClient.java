package com.jamierf.sony.bravia.client;

import com.jamierf.sony.bravia.client.api.Request;
import com.jamierf.sony.bravia.client.api.Result;
import com.jamierf.sony.bravia.client.error.CommunicationException;
import com.jamierf.sony.bravia.client.model.Command;
import com.jamierf.wol.WakeOnLan;
import com.sun.jersey.api.client.Client;
import org.apache.commons.codec.DecoderException;
import org.bitlet.weupnp.GatewayDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

// http://mendel129.wordpress.com/2014/01/21/more-sony-bravia-stuff/
// http://mendelonline.be/sony/sony.txt
// http://forum.serviio.org/viewtopic.php?f=4&t=12534
// http://192.168.0.104:52323/dmr.xml
public class BraviaClient {

    private static final String API_PATH = "/sony/%s";

    private static final String IRCC_SERVICE_ID = "urn:schemas-sony-com:service:IRCC:1";
    private static final String IRCC_SEND_ACTION = "X_SendIRCC";
    private static final String IRCC_PATH = "/sony/IRCC";
    private static final String IRCC_ARG_KEY = "IRCCCode";

    private static final Logger LOG = LoggerFactory.getLogger(BraviaClient.class);

    private final Client client;
    private final URI root;
    private final String macAddress;

    public BraviaClient(final Client client, final URI root, final String macAddress) {
        this.client = client;
        this.root = root;
        this.macAddress = macAddress;
    }

    @SuppressWarnings("unchecked")
    private <T, U extends Result> T query(final String service, final String method, final Class<U> type) {
        final String path = String.format(API_PATH, service);
        final Result<T> result = client.resource(root)
                .path(path)
                .type(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(type, new Request(method));

        return result.getResult();
    }

    public void turnOn() {
        LOG.trace("Turning on {}", macAddress);
        try {
            WakeOnLan.wake(macAddress);
        }
        catch (IOException | DecoderException e) {
            throw new CommunicationException("Error turning on " + macAddress, e);
        }
    }

    public void sendCommand(final Command code) {
        sendCommand(code.getCode());
    }

    private void sendCommand(final String code) {
        final String url = String.format("http://%s%s", root.getHost(), IRCC_PATH);

        try {
            LOG.trace("Sending IRCC: {}", code);

            final Map<String, String> args = new HashMap<>();
            args.put(IRCC_ARG_KEY, code);

            GatewayDevice.simpleUPnPcommand(url, IRCC_SERVICE_ID, IRCC_SEND_ACTION, args);
        }
        catch (IOException | SAXException e) {
            throw new CommunicationException("Error sending code " + code, e);
        }
    }
}
