package com.lit.purchaseorderapi.service.email;

import javax.mail.MessagingException;

public interface EmailService {

    void sendEmail(String message, String subject, String[]to) throws MessagingException;

}
