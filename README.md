# Spring Cloud Config Demo
This is a relatively simple example of a Spring Cloud Config Server backed by a Git repository.  Effective multi-tenancy has been enabled by using the application name (which can contain organization) as the search path for the repository.

This application will Soon™ be containerized in a Docker image to allow for easier deployment and configuration.

Next Steps:
 - Integrate Spring Cloud Bus and commit hooks so that the server can broadcast updates to clients
 - Integrate Spring Security to ensure that only clients with credentials can access application properties
 - Implement encryption/decryption of sensitive properties - this requires installation of JCE unlimited profiles