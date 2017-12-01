package lt.vu.mif.mape.ext.mail;

public interface MailSender {

    void sendEmail(String recipientEmail, String message);
}
