package matchmaking.service.domain;

import matchmaking.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "chatRooms", path = "chatRooms")
public interface ChatRoomRepository
    extends PagingAndSortingRepository<ChatRoom, Long> {}
