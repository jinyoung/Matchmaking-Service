package matchmaking.service.domain;

import matchmaking.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "chatMessages",
    path = "chatMessages"
)
public interface ChatMessageRepository
    extends PagingAndSortingRepository<ChatMessage, Long> {}
