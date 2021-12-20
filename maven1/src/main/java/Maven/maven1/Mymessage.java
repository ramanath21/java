package Maven.maven1;

import org.springframework.stereotype.Component;

@Component
public class Mymessage {

	public Mymessage() {
		System.out.println("inside constructor......");
		
	}
	void display() {
		System.out.println("inside method......");
	}
}
