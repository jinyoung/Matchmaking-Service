package matchmaking.service.domain;

import matchmaking.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "userProfiles",
    path = "userProfiles"
)
public interface UserProfileRepository
    extends PagingAndSortingRepository<UserProfile, Long> {}
