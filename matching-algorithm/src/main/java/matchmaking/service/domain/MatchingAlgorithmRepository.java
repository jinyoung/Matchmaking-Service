package matchmaking.service.domain;

import matchmaking.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "matchingAlgorithms",
    path = "matchingAlgorithms"
)
public interface MatchingAlgorithmRepository
    extends PagingAndSortingRepository<MatchingAlgorithm, Long> {}
