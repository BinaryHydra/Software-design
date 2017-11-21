package lt.vu.mif.mape.model.message;

import lt.vu.mif.mape.model.user.User;

public interface MessageFactory {
    Message createMessage(String text, User sender, User receiver);
}
