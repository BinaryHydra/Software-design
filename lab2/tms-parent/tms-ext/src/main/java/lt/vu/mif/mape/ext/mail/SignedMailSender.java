package lt.vu.mif.mape.ext.mail;

import org.springframework.stereotype.Component;

@Component
public class SignedMailSender implements MailSender {

    private static final String digitalSignature = "785178741797871394";

    @Override
    public void sendEmail(String recipientEmail, String message) {
        System.console().printf("Sending email to: " + recipientEmail + ". Content: " + message + "MessageSigned with digital signature:" + digitalSignature);
    }
}