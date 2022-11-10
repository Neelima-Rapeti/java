package net.codejava;

import java.util.*;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s= new Scanner(System.in);
		int [][][] a = new int[3][][];
		a[0] = new int[2][];
		a[1] = new int[1][];
		a[2] = new int[3][];
		
		a[0][0] = new int[2];
		a[0][1] = new int[1];
		
		
		a[1][0] = new int[2];
		
		
		a[2][0] = new int[3];
		a[2][1] = new int[2];
		a[2][2] = new int[1];
		
		System.out.println("Enter the value");
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
					
				{
					a[i][j][k] = s.nextInt();
					
				}
						}
		}
		

		for(int i=0;i<a.length;i++) {
			
			
			for(int j=0;j<a[i].length;j++)
			{
				
				for(int k=0;k<a[i][j].length;k++)
					
				{
					System.out.print(a[i][j][k]+ " ");
					
					
				}
				
			
		System.out.println("");
		
	}

}
		s.close();	
}
	
}
