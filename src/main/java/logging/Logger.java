package logging;

public class Logger {

    public final String prefix;

    public Logger(String prefix) {
        this.prefix = prefix;
    }

    public void log(Object o) {
        System.out.println("Log: " + prefix + " " + o);
    }
}
