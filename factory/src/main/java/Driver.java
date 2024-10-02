import com.example.auditor.AuditorFactory;
import com.example.auditor.BaseAuditor;

public class Driver {

    public static void main(String[] args) {
        auditCaller("login", "user1");
        auditCaller("logout", "user2");
        auditCaller("delete", "user3");
    }

    public static void auditCaller(String action, String username) {
        BaseAuditor auditor = AuditorFactory.getAuditor(action);
        auditor.auditAction(username);
    }
}
