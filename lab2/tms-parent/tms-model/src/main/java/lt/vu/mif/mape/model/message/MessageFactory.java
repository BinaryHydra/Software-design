package lt.vu.mif.mape.model.message;

import lt.vu.mif.mape.model.message.impl.TextMessage;
import lt.vu.mif.mape.model.user.User;

public class MessageFactory {

    Message createMessage(String text, User sender, User receiver) {
        return new TextMessage(text, receiver, sender);
    }
}
