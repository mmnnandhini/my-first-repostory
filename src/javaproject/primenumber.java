package javaproject;

public class primenumber {

	public static void main(String[] args) {
int m=0,flag=0;
int n=23;
m=n/2;
for(int i=2;i<m;i++)
{
   if(n%2==0)
   {
	   System.out.println("not primr no");
	   flag=1;
	   break;
   }
	if(flag==0)
	 {
		System.out.println("prime no");
	}
	

	
	}

}
}