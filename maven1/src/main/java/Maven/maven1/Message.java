package Maven.maven1;

import org.springframework.beans.factory.annotation.Autowired;

public class Message {
  @Autowired
	Mymessage msg;
	public Mymessage getMsg() {
		return msg;
	}
	
	public void setMsg(Mymessage msg) {
		this.msg=msg;
	}
	void displaymsg() {
		msg.display();
	}
}
