package matchmaking.service.infra;

import matchmaking.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ChatRoom>> {

    @Override
    public EntityModel<ChatRoom> process(EntityModel<ChatRoom> model) {
        return model;
    }
}
