package com.lit.purchaseorderapi.service.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(EmailServiceImpl.class);


    private JavaMailSender javaMailSender;

    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(String message, String subject, String[]to) {

        MimeMessage mail = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(mail, true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText("", message);

            javaMailSender.send(mail);
        } catch (MessagingException e) {
            log.error("Unable to send email: {}", e);
        }
    }
}
