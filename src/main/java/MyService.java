
import event.TestEvent;
import logging.Logger;
import org.springframework.context.ApplicationListener;

import java.util.List;

public class MyService implements ApplicationListener<TestEvent> {
	private final String value;
	private final List<String> names;
	private final List<Logger> loggers;


	public MyService (String value, List<String> names, List<Logger> loggers) {
		this.value = value;
		this.names = names;
		this.loggers = loggers;
	}

	public void doWork() {
		loggers.forEach(l -> l.log("value = " + value));
		names.forEach(n -> loggers.forEach(l -> l.log(n)));  //распечатка объектов List<String> names логгерами
	}

	@Override
	public void onApplicationEvent(TestEvent event) {
		loggers.forEach(logger -> logger.log("handled event: " + event));
	}
}
