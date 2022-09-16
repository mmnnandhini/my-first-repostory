package javaproject;

public class prime1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,m;
for(i=2;i<100;i++)
{
	m=0;
	for(j=2;j<i;j++)
	{
		if(i%j==0)
			m=1;
		break;
	}
	if(m==0)
	{
		System.out.print(i+",");
	}
}
	
	



	}

}
