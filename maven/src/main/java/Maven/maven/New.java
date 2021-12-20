package Maven.maven;

public class New {
	int id;
	String name,price;

	
	
	
	public int setId(int id) {
		this.id = id;
		return id;
	}
	public String setName(String name) {
		this.name = name;
		return name;
	}
	public String setPrice(String price) {
		this.price = price;
		return price;
	}
	
	
	
	void display()
	{
		System.out.print("employyeee\n"+"id:"+id+"\nname:"+name+"\nprice:"+price+"\n");
	}
	
}
