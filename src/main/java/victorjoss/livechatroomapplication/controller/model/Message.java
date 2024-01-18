package victorjoss.livechatroomapplication.controller.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;

    public enum Status {
        JOIN,
        MESSAGE,
        LEAVE
    }

}
