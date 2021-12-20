package Maven.maven;

public class Student {
String publisher;
int id;
String price;

public Student(String publisher,int id,String price) {
	this.publisher=publisher;
	this.id=id;
	this.price=price;
}

public void display() {
	// TODO Auto-generated method stub
	System.out.println("name:"+publisher+"\nid:"+id+"\nsalary:"+price);
}

}
