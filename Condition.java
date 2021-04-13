import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num1=scan.nextInt();
scan.close();
if(num1%2==0) {
	System.out.println("Even Number");
} else {
	System.out.println("Odd Number");
}
	}

}
