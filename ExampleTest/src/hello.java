import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stubx
		System.out.println("Hello Henry");
	
		Scanner num = new Scanner(System.in);
		
	System.out.println("Enter a number");
	int a = num.nextInt();
	for(int i=1; i<=12; i++){
		System.out.println(a +" * "+ i +" = "+ a * i);
	}
		

	}

}
