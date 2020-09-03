package ca.purpleowl.examples.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller illustrates direct retrieval of a value from the Cloud Config properties...
 */
@RestController
public class HelloController {
    @Value("${example-client.message:Default hello message}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return message;
    }
}
