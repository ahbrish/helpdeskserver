package negusse.abraham.server.domain.helpRequest.repo;

import negusse.abraham.server.domain.helpRequest.model.HelpRequest;
import org.springframework.data.repository.CrudRepository;

public interface HelpRequestRepo extends CrudRepository<HelpRequest, Long> {
}
