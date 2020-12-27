package com.unittest.mailchecker.utils;

public class MailUtils {
    public static boolean checkMail(String mail) {
        return mail.contains("@");
    }
}
