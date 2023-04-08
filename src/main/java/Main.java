import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Logger logger = new Logger("DEBUG");
//        Database database = new Database(logger);
//        AuthService authService = new AuthService(database);
//        UserService userService = new UserService(logger, authService, database);
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        UserService userService = context.getBean(UserService.class);
        userService.isUserAuth(new User("Ivanov", "Ivan12", "123124"));

        Logger logger = context.getBean(Logger.class);
        logger.log("Hello world");


    }
}
