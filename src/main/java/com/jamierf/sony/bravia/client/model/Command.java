package com.jamierf.sony.bravia.client.model;

// http://mendelonline.be/sony/sony.txt
// https://github.com/chregu/php-control-sony-tv/blob/master/lib.php
// http://openremote4.rssing.com/chan-14734771/all_p200.html
// http://www.openremote.org/display/forums/Sony+TV+HTTP+control
public enum Command {
    POWER_OFF("AAAAAQAAAAEAAAAvAw=="),

    MODE_ANALOG("AAAAAgAAAHcAAAANAw=="),
    MODE_DIGITAL("AAAAAgAAAJcAAAAyAw=="),

    INPUT_TOGGLE("AAAAAQAAAAEAAAAlAw=="),
    INPUT_HDMI_1("AAAAAgAAABoAAABaAw=="),
    INPUT_HDMI_2("AAAAAgAAABoAAABbAw=="),
    INPUT_HDMI_3("AAAAAgAAABoAAABcAw=="),
    INPUT_HDMI_4("AAAAAgAAABoAAABdAw=="),

    GGUIDE("AAAAAQAAAAEAAAAOAw=="),
    EPISODE_GUIDE("AAAAAgAAAKQAAABbAw=="),
    FAVORITES("AAAAAgAAAHcAAAB2Aw=="),
    DISPLAY("AAAAAQAAAAEAAAA6Aw=="),
    HOME("AAAAAQAAAAEAAABgAw=="),
    OPTIONS("AAAAAgAAAJcAAAA2Aw=="),
    RETURN("AAAAAgAAAJcAAAAjAw=="),
    CONFIRM("AAAAAQAAAAEAAABlAw=="),
    SUBTITLE("AAAAAgAAAJcAAAAoAw=="),
    EXIT("AAAAAQAAAAEAAABjAw"),
    MODE3D("AAAAAgAAAHcAAABNAw=="),
    SCENE("AAAAAgAAABoAAAB4Aw=="),
    IMANUAL("AAAAAgAAABoAAAB7Aw=="),

    PLAY("AAAAAgAAAJcAAAAaAw=="),
    PAUSE("AAAAAgAAAJcAAAAZAw=="),
    STOP("AAAAAgAAAJcAAAAYAw=="),
    NEXT("AAAAAgAAAJcAAAA9Aw=="),
    FORWARD("AAAAAgAAAJcAAAAcAw=="),
    PREV("AAAAAgAAAJcAAAA8Aw=="),
    REWIND("AAAAAgAAAJcAAAAbAw=="),

    RED("AAAAAgAAAJcAAAAlAw=="),
    GREEN("AAAAAgAAAJcAAAAmAw=="),
    YELLOW("AAAAAgAAAJcAAAAnAw=="),
    BLUE("AAAAAgAAAJcAAAAkAw=="),

    NUM_0("AAAAAQAAAAEAAAAJAw=="),
    NUM_1("AAAAAQAAAAEAAAAAAw=="),
    NUM_2("AAAAAQAAAAEAAAABAw=="),
    NUM_3("AAAAAQAAAAEAAAACAw=="),
    NUM_4("AAAAAQAAAAEAAAADAw=="),
    NUM_5("AAAAAQAAAAEAAAAEAw=="),
    NUM_6("AAAAAQAAAAEAAAAFAw=="),
    NUM_7("AAAAAQAAAAEAAAAGAw=="),
    NUM_8("AAAAAQAAAAEAAAAHAw=="),
    NUM_9("AAAAAQAAAAEAAAAIAw=="),

    VOLUME_UP("AAAAAQAAAAEAAAASAw=="),
    VOLUME_DOWN("AAAAAQAAAAEAAAATAw=="),
    VOLUME_MUTE("AAAAAQAAAAEAAAAUAw=="),

    ARROW_UP("AAAAAQAAAAEAAAB0Aw=="),
    ARROW_DOWN("AAAAAQAAAAEAAAB1Aw=="),
    ARROW_LEFT("AAAAAQAAAAEAAAA0Aw=="),
    ARROW_RIGHT("AAAAAQAAAAEAAAAzAw=="),

    CHANNEL_UP("AAAAAQAAAAEAAAAQAw=="),
    CHANNEL_DOWN("AAAAAQAAAAEAAAARAw=="),

    APP_NETLFIX("AAAAAgAAABoAAAB8Aw==");

    private final String code;

    private Command(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
