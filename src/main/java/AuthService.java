public class AuthService {
    private final Database db;

    public AuthService(Database db) {
        this.db = db;
    }

    public boolean isAuth(String login) {
        return db.isUserExist(login);
    }

    public void registerUser(String login, String password) {
        db.registerUser(login, password);
    }
}
