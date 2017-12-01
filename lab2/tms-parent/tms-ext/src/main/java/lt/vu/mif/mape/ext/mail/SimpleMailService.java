package lt.vu.mif.mape.ext.mail;

import org.springframework.stereotype.Component;

@Component
public class SimpleMailService implements MailSender {
    @Override
    public void sendEmail(String recipientEmail, String message) {
        System.console().printf("Sending email to: " + recipientEmail + ". Content: " + message);
    }
}
