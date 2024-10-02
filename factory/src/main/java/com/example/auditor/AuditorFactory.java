package com.example.auditor;

public class AuditorFactory {

    public static BaseAuditor getAuditor(String actionType) {
        var action = actionType.toUpperCase();
        return switch (action) {
            case "LOGIN" -> new UserLoginAuditor();
            case "LOGOUT" -> new UserLogoutAuditor();
            case "DELETE" -> new UserDeleteAuditor();
            default -> null;
        };
    }
}
