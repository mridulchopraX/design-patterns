package com.example.auditor;

public class UserLogoutAuditor implements BaseAuditor {

    @Override
    public void auditAction(String username) {
        System.out.println(username + " logged out.");
    }
}
