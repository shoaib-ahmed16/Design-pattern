package BehavioralPattern.Observer;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventSource eventSource = new EventSource();
		Thread th = new Thread(eventSource);
		th.start();
	}

}
