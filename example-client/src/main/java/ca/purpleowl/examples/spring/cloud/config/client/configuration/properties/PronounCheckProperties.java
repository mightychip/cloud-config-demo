package ca.purpleowl.examples.spring.cloud.config.client.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * POJOs annotated with @ConfigurationProperties and properly configured will get loaded from the application
 * properties.  Just like everything else, these properties come from our Cloud Config Server.  Righteous.
 *
 * Where this pattern really stands out is when values from the Cloud Config Server are refreshed.  When using
 * {@link ConfigurationProperties} annotated classes, the values are refreshed with the Application Context.  Changes
 * are immediately made available.
 */
@ConfigurationProperties(prefix = "example-client.pronoun.check")
@Getter
@Setter
public class PronounCheckProperties {
    private String name;
    private String pronoun;
    private String linkingVerb;
}
