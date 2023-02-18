package com.valtanix.urlshortener.urlrequest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UrlServicesRequest {

    private String longUrl;
    private String shortenedUrl;
}
