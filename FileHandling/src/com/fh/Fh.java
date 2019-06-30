package com.fh;

import java.util.*;
import java.io.*;

public class Fh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your msg");
		String line = scan.nextLine();
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("info.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(line);
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
