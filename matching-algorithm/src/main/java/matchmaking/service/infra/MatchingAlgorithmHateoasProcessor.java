package matchmaking.service.infra;

import matchmaking.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MatchingAlgorithmHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MatchingAlgorithm>> {

    @Override
    public EntityModel<MatchingAlgorithm> process(
        EntityModel<MatchingAlgorithm> model
    ) {
        return model;
    }
}
