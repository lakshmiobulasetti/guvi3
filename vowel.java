import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0;
		Scanner s=new Scanner(System.in) ;
		System.out.println("enter a character:");
		char ch=s.next().charAt(0);
		switch(ch)
		{
	            case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		i++;
		}
		if(i==1)
		
		System.out.println("entered char"+ch+" is vowel");
		
		else
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		                               
		
		System.out.println("entered number "+ch+" is consonet");
		
		else
		
		System.out.println("entered char is invalid");
		
		
	            }  
		}

	
