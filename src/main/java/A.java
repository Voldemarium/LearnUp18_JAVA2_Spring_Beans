import logging.Logger;

public class A {
	private Logger logger;

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public void doWork() {
		logger.log("I'm alive");
	}
}
