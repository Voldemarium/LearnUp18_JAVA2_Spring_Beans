package event;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EventData {
	private final LocalDateTime createAt;
	private final String title;
	private final String details;

	public EventData(String title, String details) {
		this.title = title;
		this.details = details;
		createAt = LocalDateTime.now();
	}
}
