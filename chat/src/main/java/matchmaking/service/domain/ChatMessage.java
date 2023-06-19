package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import matchmaking.service.ChatApplication;
import matchmaking.service.domain.MessageReceivedEvent;

@Entity
@Table(name = "ChatMessage_table")
@Data
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;

    private Long chatRoomId;

    private Long senderId;

    private Long receiverId;

    private String messageText;

    private Date messageTime;

    @PostPersist
    public void onPostPersist() {
        MessageReceivedEvent messageReceivedEvent = new MessageReceivedEvent(
            this
        );
        messageReceivedEvent.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ChatMessageRepository repository() {
        ChatMessageRepository chatMessageRepository = ChatApplication.applicationContext.getBean(
            ChatMessageRepository.class
        );
        return chatMessageRepository;
    }
}
