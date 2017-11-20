package lt.vu.mif.mape.model.message.impl;

import lt.vu.mif.mape.model.message.Message;
import lt.vu.mif.mape.model.message.MessageStatus;
import lt.vu.mif.mape.model.user.User;

public class TextMessage implements Message {

    private String text;

    private User sender;

    private User recipient;

    private MessageStatus status;

    public TextMessage(String text, User sender, User recipient) {
        this.text = text;
        this.sender = sender;
        this.recipient = recipient;
        this.status = MessageStatus.SEND;
    }

    //region setters and getters

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    //endregion

}
