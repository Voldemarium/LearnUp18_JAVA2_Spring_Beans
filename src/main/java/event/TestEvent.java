package event;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
	public TestEvent(Object source) {
		super(source);
	}

	public static TestEvent of(String title, String details) {
		return new TestEvent(new EventData(title, details));
	}
}
