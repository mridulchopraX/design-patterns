package com.example.auditor;

public class UserLoginAuditor implements BaseAuditor {

    @Override
    public void auditAction(String username) {
        System.out.println(username + " logged in");
    }
}
