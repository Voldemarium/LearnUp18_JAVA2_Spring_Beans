package logging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileLogger implements Logger {

	private final String prefix;
	private final String logPath;
	private final Path logFile;

	public FileLogger(String prefix, String logPath) {
		this.prefix = prefix;
		this.logPath = logPath;
		logFile = Path.of(logPath);
		if (!Files.exists(logFile)) {
			try {
				Files.createFile(logFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public void log(Object msg) {
		try {
			Files.writeString(logFile, "Log: " + prefix + " " + msg.toString() + "\n", StandardOpenOption.APPEND);
			//(StandardOpenOption.APPEND - опция добавления строк)
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
