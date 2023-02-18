package com.valtanix.urlshortener.urlservices;

import java.net.URISyntaxException;

public interface UrlService {

    String shortenUrl(String url) throws URISyntaxException;
    String getOriginalUrl(String url) throws URISyntaxException;


}
