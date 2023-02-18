package com.valtanix.urlshortener.resource;


import com.valtanix.urlshortener.urlrequest.UrlServicesRequest;
import com.valtanix.urlshortener.urlservices.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;


@RestController
@RequestMapping("/rest")
public class UrlShortenerResource {

    @Autowired
    private UrlService urlService;

    @PostMapping("/example")
    public ResponseEntity longUrl(@RequestBody UrlServicesRequest urlServicesRequest) throws URISyntaxException {
        String longURl=urlServicesRequest.getLongUrl();
        String value=urlService.shortenUrl(longURl);
        return ResponseEntity.ok(value);

    }@PostMapping("/example1")
        public ResponseEntity getOriginal(@RequestBody UrlServicesRequest urlServicesRequest ) throws URISyntaxException {
        String original=urlService.getOriginalUrl(urlServicesRequest.getShortenedUrl());
        System.out.println();
        return ResponseEntity.ok(original);
    }

    }





