
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5,i=1;
while(i<=10) {
	System.out.println(num+"*"+i+"="+(num*i));
	i++;
}


int f=1,ii=1,nnum=6;

while(ii<=nnum) {
	f=f*ii;
	ii++;
}
System.out.println("factorial is "+f);

int n1=0,n2=1,n3,iii=2,count=20;    
System.out.print(n1+" "+n2); 
   while(iii<count)  
{    
 n3=n1+n2;    
 System.out.print(" "+n3);    
 n1=n2;    
 n2=n3;
 ++iii;
}
   System.out.println();     
   


int sum=0, nuum = 1, ccount=0;
while(ccount<=100){
    if(nuum%2 == 0){
        sum += nuum;
        ccount++;
    }
    nuum++;
}
System.out.println("Sum: "+sum);


	}

}
