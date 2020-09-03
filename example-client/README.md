#Example Client
This is a very simple Example Client built simply to display the power of Spring Cloud Config's functionality.

The `dev` and `prod` profiles point to H2 and MySQL databases effectively, with the latter being hosted in a Docker container.  Profiles (stored in Git and made available by the server) provide the appropriate configurations.  When these configurations are updated in Git, the updates are retrieved and made available by the Spring Cloud Config server.  When this happens, an approprate event is broadcast via Spring Cloud Bus to inform clients (like this one) that they should refresh their contexts from the Spring Cloud Config Server.

NOTE: Use of the same database server that the Spring Cloud Configuration data is stored in is probably unwise, but this is an example and not production.  If you're copying this example, keep that in mind!