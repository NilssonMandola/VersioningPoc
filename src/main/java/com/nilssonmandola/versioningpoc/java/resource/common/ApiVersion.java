package com.nilssonmandola.versioningpoc.java.resource.common;

import kotlin.NotImplementedError;

import java.util.Arrays;

public enum ApiVersion {
    V_1_0("1.0"),
    V_2_0("2.0"),
    V_3_0("3.0");

    private final String stringValue;

    ApiVersion(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static ApiVersion fromString(String input) {
        return Arrays.stream(values())
                .filter(apiVersion -> apiVersion.getStringValue().equals(input))
                .findFirst()
                .orElseThrow(NotImplementedError::new);
    }

}
