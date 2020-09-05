package ca.purpleowl.examples.spring.cloud.config.client.jpa.respository;

import ca.purpleowl.examples.spring.cloud.config.client.jpa.model.GuestBookEntry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Used for a very simple JPA REST Repository to demonstrate DB configurations being passed with the Cloud Config
 * properties.
 */
@RepositoryRestResource(collectionResourceRel = "guest-book", path = "guest-book")
public interface GuestBookEntryRepository extends PagingAndSortingRepository<GuestBookEntry, Long> {
}
