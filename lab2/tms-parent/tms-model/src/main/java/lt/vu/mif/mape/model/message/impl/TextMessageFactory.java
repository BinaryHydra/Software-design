package lt.vu.mif.mape.model.message.impl;

import lt.vu.mif.mape.model.message.Message;
import lt.vu.mif.mape.model.message.MessageFactory;
import lt.vu.mif.mape.model.message.impl.TextMessage;
import lt.vu.mif.mape.model.user.User;

public class TextMessageFactory implements MessageFactory{

    public Message createMessage(String text, User sender, User receiver) {
        return new TextMessage(text, receiver, sender);
    }
}
