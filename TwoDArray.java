package com.functionalprograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TwoDArray {
	
	public static void main(String[]args) {
		int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
		 OutputStreamWriter output = new OutputStreamWriter(System.out);
		 PrintWriter printWriter = new PrintWriter(output);
		 
		 for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				 printWriter.print(array[i][j]);
				 System.out.println(array[i][j]);
				 
			 }
		 }
		 
	}

}
