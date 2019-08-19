package com.lit.purchaseorderapi.service.email;

public interface EmailService {

    void sendEmail(String message, String subject, String[]to);
}
