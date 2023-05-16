import logging.Logger;

public class Database {

    private final Logger logger;

    public Database(Logger logger) {
        this.logger = logger;
    }

    public boolean isUserExist(String login) {
        return true;
    }

    public void registerUser(String login, String password) {
        logger.log("User created");
    }

    public User getUserByLogin(String login) {
        return new User("Ivan", "Ivan33", "spb");
    }
}
