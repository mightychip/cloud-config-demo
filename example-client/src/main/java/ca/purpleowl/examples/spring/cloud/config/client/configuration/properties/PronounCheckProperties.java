package ca.purpleowl.examples.spring.cloud.config.client.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "example-client.pronoun.check")
public class PronounCheckProperties {
    private String name;
    private String pronoun;
    private String linkingVerb;

    public String getName() {
        return name;
    }

    public PronounCheckProperties setName(String name) {
        this.name = name;
        return this;
    }

    public String getPronoun() {
        return pronoun;
    }

    public PronounCheckProperties setPronoun(String pronoun) {
        this.pronoun = pronoun;
        return this;
    }

    public String getLinkingVerb() {
        return linkingVerb;
    }

    public PronounCheckProperties setLinkingVerb(String linkingVerb) {
        this.linkingVerb = linkingVerb;
        return this;
    }
}
