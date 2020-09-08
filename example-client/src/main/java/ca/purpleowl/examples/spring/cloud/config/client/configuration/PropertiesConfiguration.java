package ca.purpleowl.examples.spring.cloud.config.client.configuration;

import ca.purpleowl.examples.spring.cloud.config.client.configuration.properties.PronounCheckProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Enable configuration properties and specify our Configuration Properties beans... well, bean in this case I guess.
 */
@Configuration
@EnableConfigurationProperties(PronounCheckProperties.class)
public class PropertiesConfiguration {
}
