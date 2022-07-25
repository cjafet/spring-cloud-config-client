package com.cjafet.configclient.springcloudconfigclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("server")
@org.springframework.context.annotation.Configuration
public class Configuration {
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
