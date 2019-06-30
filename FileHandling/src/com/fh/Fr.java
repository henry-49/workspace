package com.fh;

import java.io.*;

public class Fr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = null;
		
		try {
			FileReader fr = new FileReader("info.txt");
			BufferedReader br = new BufferedReader(fr);
			try {
				while ((msg=br.readLine())!= null){
					System.out.println(msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
