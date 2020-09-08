package ca.purpleowl.examples.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller illustrates direct retrieval of a value from the Cloud Config properties...
 *
 * Notice that when we use the {@link Value} annotation, changes from a refreshed Application Context (ie. when values
 * from the Cloud Config Server have changed) are not seeded.  This is an undesirable design trait, as it requires a
 * full application restart.
 */
@RestController
@RequestMapping("/message")
public class HelloController {
    @Value("${example-client.message:Default hello message}")
    private String message;

    @GetMapping
    public String getMessage() {
        return message;
    }
}
