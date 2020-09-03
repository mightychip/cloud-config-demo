#Cloud Config Server
This is a simple Cloud Config server used for the purposes of a demo of Spring Cloud Config's capabilities.

This application includes dev/stage profiles stored in an external git repository (https://github.com/mightychip/cloud-config-properties.git) and production profiles stored in a Dockerized MySQL database.  Pattern matching is used to map profiles to the appropriate backend (ie. Git for `dev`/`stage` and JDBC for `prod`).

Rather than utilize Spotify's Docker plugin for Maven, we'll lean on Spring Boot's `spring-boot:build-image` Maven goal.  This ensures we build a proper layered image, which results in easier updates and more efficient downloads when new versions get released.  This is why there is a conspicuous absence of a Dockerfile in this module.