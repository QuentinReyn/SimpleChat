package chatProject.model.chatroom;

import chatProject.model.messages.Chatroom;
import chatProject.model.messages.Message;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChatroomTest {

    @Test
    public void getName() {
        String name = "NewChatroom";
        Chatroom chatroom = new Chatroom(name, null, null);

        assertNotEquals("The chatroom name is not the one set in the constructor",
                "OtherChatroom", chatroom.getName());
    }

    @Test
    public void getCurrentMessage() {
        List<Message> listMessage = new ArrayList<Message>();
        listMessage.add(new Message(0, null, "TEST"));
        listMessage.add(new Message(1, null, "OTHERTEST"));
        assertEquals("The last message is the one set in the constructor","OTHERTEST",listMessage.get(listMessage.size()-1).getMessage());
    }

}