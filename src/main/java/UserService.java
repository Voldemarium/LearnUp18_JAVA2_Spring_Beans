import logging.ConsoleLogger;
import logging.Logger;

public class UserService {

    private final ConsoleLogger logger;
    private final AuthService authService;
    private final Database db;

    public UserService(ConsoleLogger logger, AuthService authService, Database db) {
        this.logger = logger;
        this.authService = authService;
        this.db = db;
    }

    public boolean isUserAuth(User user) {
       boolean auth = authService.isAuth(user.getLogin());
       logger.log("User auth = " + auth);
       return auth;
    }

    public User getUserByLogin(String login) {
         return db.getUserByLogin(login);
    }
}
