import event.TestEvent;
import logging.ConsoleLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        UserService userService = context.getBean(UserService.class);
        userService.isUserAuth(new User("Ivanov", "Ivan12", "123124"));

        ConsoleLogger logger = context.getBean(ConsoleLogger.class);
        logger.log("Hello world");

        //Способ 1 создания обьекта по бину (через название класса)
        MyService myService = context.getBean(MyService.class);
        myService.doWork();
        //Способ 2 создания обьекта по бину (через id бина)
        MyService myService1 = (MyService) context.getBean("myService");
        myService1.doWork();

        A a = context.getBean(A.class);
        a.doWork();

        context.publishEvent(TestEvent.of("Event", "My first event"));

        ResourceBundle resourceDefault = ResourceBundle.getBundle("text");
        String sDefault = resourceDefault.getString("startToWork");
        logger.log(sDefault);
        ResourceBundle resourceUS = ResourceBundle.getBundle("text", Locale.US);
        String sUS = resourceUS.getString("startToWork");
        logger.log(sUS);

        logger.log(context.getMessage("startToWork", null, Locale.getDefault()));
        logger.log(context.getMessage("startToWork", null, Locale.US));
    }
}
