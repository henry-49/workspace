package com.exc;
 class MyOwnException extends Exception{
	public MyOwnException(String msg){
		super(msg);
	}
}
public class EmployeeTest {
	static void employeeAge(int age) throws MyOwnException{
		if(age < 0)
			throw new MyOwnException("Age can not be less than zero");
		else
			System.out.println("Input is valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			employeeAge(-2);
		}catch(MyOwnException e){
			System.out.println("Age can not be less than zero");
		}
	}

	


}
