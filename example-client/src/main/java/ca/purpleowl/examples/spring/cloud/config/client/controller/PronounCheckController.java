package ca.purpleowl.examples.spring.cloud.config.client.controller;

import ca.purpleowl.examples.spring.cloud.config.client.configuration.properties.PronounCheckProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PronounCheckController {
    private static final String PRONOUN_CHECK_MESSAGE = "%s you say?  I've heard %s %s an amazing person!!";

    private final PronounCheckProperties properties;

    @Autowired
    public PronounCheckController(PronounCheckProperties properties) {
        this.properties = properties;
    }

    @GetMapping("pronoun-check")
    public String pronounCheck() {
        return String.format(PRONOUN_CHECK_MESSAGE, properties.getName(), properties.getPronoun(), properties.getLinkingVerb());
    }
}
