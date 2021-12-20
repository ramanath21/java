package com.maven1;

import org.springframework.beans.factory.annotation.Autowired;

import Maven.maven1.Mymessage;

public class Student {
	 @Autowired
		Address msg;
		public Address getMsg() {
			return msg;
		}
		
		public void setMsg(Address msg) {
			this.msg=msg;
		}
		void display() {
			msg.displaymsg();
		}
}
