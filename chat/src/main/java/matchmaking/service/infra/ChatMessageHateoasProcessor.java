package matchmaking.service.infra;

import matchmaking.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ChatMessage>> {

    @Override
    public EntityModel<ChatMessage> process(EntityModel<ChatMessage> model) {
        return model;
    }
}
