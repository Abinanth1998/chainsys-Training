import java.util.*;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
			int number=scan.nextInt(),sum=0,temp=0;
				for(int i=number;i>=0;i--) {
						temp=number%10;
						number=number/10;
						sum=sum+temp;
	
				}

					System.out.println(sum);
					scan.close();
		}
	
}
