package chatProject.model.messages;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void getId() {
        int id = 42;
        final Message<Object> message = new Message<>(42, null, null);

        assertNotEquals("The message ID is not the one set in the constructor",
                16, message.getId());
    }

    @Test
    public void getContent() {
        String content = "TEST";
        final Message<String> message = new Message<>(0, null, content);

        assertNotEquals("The message content is not the one set in the constructor",
                "OTHERTEST", message.getMessage());
    }

}