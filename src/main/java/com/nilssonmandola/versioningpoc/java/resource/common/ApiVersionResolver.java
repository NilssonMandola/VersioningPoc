package com.nilssonmandola.versioningpoc.java.resource.common;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ApiVersionResolver {

    private ApiVersion apiVersion;

    public void setApiVersion(String apiVersion) {
        this.apiVersion = ApiVersion.fromString(apiVersion);
    }

    public ApiVersion getApiVersion() {
        return apiVersion;
    }

}
