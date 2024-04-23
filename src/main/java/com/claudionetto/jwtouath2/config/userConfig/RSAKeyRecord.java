package com.claudionetto.jwtouath2.config.userConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "jwt")
public record RSAKeyRecord(RSAPublicKey rsaPublicKey, RSAPrivateKey rsaPrivateKey) {
}
