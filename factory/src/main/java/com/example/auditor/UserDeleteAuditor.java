package com.example.auditor;

public class UserDeleteAuditor implements BaseAuditor {
    @Override
    public void auditAction(String username) {
        System.out.println(username + " deleted their account");
    }
}
