import java.util.*;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the English mark");
		int english=scan.nextInt();
		System.out.println("Enter the Tamil mark");
		int tamil=scan.nextInt();
		System.out.println("Enter the Maths mark");
		int maths=scan.nextInt();
		System.out.println("Enter the Social mark");
		int social=scan.nextInt();
		System.out.println("Enter the Science mark");
		int science=scan.nextInt();
		//finding average
		int average=english+tamil+maths+social+science;
		//finding percentage
		double percentage = (double)average/5;
		scan.close();
		System.out.println(average);
		System.out.println(percentage);
		grade g1=new grade();


		
						if((int)percentage>=95) {
							g1.destinsion();
						}
						
			
						else if((int)percentage>=70){
						g1.firstClass();
					} 
				
			
						else if((int)percentage>=50) {
						g1.secondClass();
					} 
				
						else
					g1.fail();
	
		
	}
	public static void destinsion() {
		System.out.println("Distinsion");
	}
	public static void firstClass() {
		System.out.println("FirstClass");
	}
	public static void secondClass() {
		System.out.println("SecondClass");
	}
	public static void fail() {
		System.out.println("Fail");
	}

}
