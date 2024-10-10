package com.users.microservices.utils;

public interface EmailSender {
    void sendEmail(String toEmail, String body);

}
