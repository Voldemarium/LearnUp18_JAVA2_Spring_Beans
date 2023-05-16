package logging;

public class ConsoleLogger implements Logger{

    public final String prefix;

    public ConsoleLogger(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void log(Object o) {
        System.out.println("Log: " + prefix + " " + o);
    }
}
