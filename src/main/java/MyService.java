
import logging.Logger;

import java.util.List;

public class MyService {
	private final String value;
	private final List<String> names;
	private final List<Logger> loggers;


	public MyService(String value, List<String> names, List<Logger> loggers) {
		this.value = value;
		this.names = names;
		this.loggers = loggers;
	}

	public void doWork() {
		loggers.forEach(l -> l.log("value = " + value));
		names.forEach(n -> loggers.forEach(l -> l.log(n)));  //распечатка объектов List<String> names логгерами
	}
}
