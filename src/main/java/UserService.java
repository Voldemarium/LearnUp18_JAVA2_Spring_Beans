public class UserService {

    private final Logger logger;
    private final AuthService authService;
    private final Database db;

    public UserService(Logger logger, AuthService authService, Database db) {
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
