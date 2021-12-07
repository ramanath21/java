package day3;

class Traiangle{
	  int a,b,c;
	  public double getArea(){
	    double s = (a+b+c)/2.0;
	    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	  }
	  public double getPerimeter(){
	    return (a+b+c)/2.0;
	  }
	}

	class Ans{
	  public static void main(String[] args){
	    Traiangle t = new Traiangle();
	    t.a = 2;
	    t.b = 5;
	    t.c = 6;
	    System.out.println(t.getArea());
	    System.out.println(t.getPerimeter());
	  }
	}