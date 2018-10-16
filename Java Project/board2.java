board2.java
Long ago
Jul 19, 2016
C
You created an item in
Google Drive Folder
15bce004
Created items:
Java
board2.java

import java.io.*;
class board2
{
	public static void main(String args[]) throws IOException
	{
	int num1,num2;
	boolean flag1,flag2;
	flag1=false;
	flag2=false;
	num1=Integer.parseInt(args[0]);
	num2=Integer.parseInt(args[1]);
	int arr[]={7,25,5,19,20};
	for(int i=0;i<5;i++)
	{
	if(num1==arr[i])
	flag1=true;
	if(num2==arr[i])
	flag2=true;
	}
	if(flag1 && flag2)
	System.out.println("Bingo");
	else
	System.out.println("Not Bingo");
	

	}
}
