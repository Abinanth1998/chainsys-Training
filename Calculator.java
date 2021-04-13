import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		String symbol=scan.next();
		scan.close();
		switch(symbol) {
		case "+": 
			System.out.println(num1+num2);
		break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
			default :
				System.out.println("Enter correct value");
			
		}
	}

}
