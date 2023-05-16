
import logging.Logger;

import java.util.List;

public class MyService {
	private final String value;
	private final List<String> names;
	private final Logger logger;


	public MyService(String value, List<String> names, Logger logger) {
		this.value = value;
		this.names = names;
		this.logger = logger;
	}

	public void doWork() {
		logger.log("value = " + value);
		names.forEach(logger :: log);  //распечатка объектов List names логгером logging.Logger logger
	}
}
