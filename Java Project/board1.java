import java.io.*;
class board1
{
	public static void main(String args[]) throws IOException
	{
	int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<15;i++)
	{
	A[15]+=A[i];
	}
	A[16]=(2*A[15])/16;
	A[17]=A[0];
	for(int i=0;i<17;i++)
	{
	if(A[i]<A[17])
	{
	A[17]=A[i];
	}
	}
	System.out.println("The array is : ");
	for(int i=0;i<17;i++)
	System.out.println(A[i]);
	}
}
