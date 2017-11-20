package lt.vu.mif.mape.model.message;

import lt.vu.mif.mape.model.user.User;

public interface Message {

    String getText();

    User getSender();

    User getRecipient();

    MessageStatus getStatus();

    void setStatus(MessageStatus status);
}
