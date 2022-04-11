package arrayExample;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args)   {  
	Scanner sc=new Scanner(System.in);  
	int[] array = new int[10];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<10; i++)  {     
	array[i]=sc.nextInt();  
	System.out.println("Array elements are "+array[i]);  
	}  	 
	}  
	}  
