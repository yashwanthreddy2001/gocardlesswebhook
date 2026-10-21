package com.gocardless.gocardlesswebhook.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1/test")
public class TestWebhook {

    
    @PostMapping("/webhook")
    public String webhookHandler(
            @RequestHeader(value = "Webhook-Signature", required = false) String signature,
            @RequestBody String body) {

        System.out.println("Received webhook with signature: " + signature);
        System.out.println("Webhook body: " + body);   
      return "";
    }
}
