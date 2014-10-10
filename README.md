Sony Bravia Client
========

A Java client for controlling Sony Bravia TVs.

[![Build Status](https://api.travis-ci.org/reines/sony-bravia-client.png)](https://travis-ci.org/reines/sony-bravia-client)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.jamierf/sony-bravia-client/badge.png)](https://maven-badges.herokuapp.com/maven-central/com.jamierf/sony-bravia-client)

sony-bravia-client can be found in maven central.

## Installation

```xml
<dependency>
    <groupId>com.jamierf</groupId>
    <artifactId>sony-bravia-client</artifactId>
    <version>...</version>
</dependency>
```

## Usage

```java
final BraviaClient client = new BraviaClient(
    Client.create(),
    URI.create("http://192.168.0.104"),
    "F4:B7:E2:99:3D:50"
);
client.turnOn();
client.sendCommand(Command.INPUT_HDMI_1);
```

## License

Released under the [Apache 2.0 License](LICENSE).
