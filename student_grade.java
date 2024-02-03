package Calculator;
import java.util.*;

public class student_grade {

	public static void main(String[] args) {
		
		double score,sum=0;
		double percent;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter total number of subjects");
		int no =in.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("Enter your score out of 100");
			score=in.nextDouble();
			
			if(score<=100)
			{
				sum=sum+score;
			}
			else {
				System.out.println("Enter number is invalid");
			}
		}
		percent=sum/no;
		
		System.out.println("Your total score is:"+sum);
		System.out.println("Percentage:"+percent);

		if(percent>=90 && percent<=100) {
			System.out.println("Grade A+");
		}
			else if(percent>=80 && percent<90) {
				System.out.println("Grade A");
			}
			else if(percent>=70 && percent<80) {
				System.out.println("Grade B+");
			}
			else if(percent>=60 && percent<70) {
				System.out.println("Grade B");
			}
			else if(percent>=50 && percent<60) {
				System.out.println("Grade C");
			}
			else if(percent>=40 && percent<50) {
				System.out.println("Grade D");
			}
			else {
				System.out.println("Grade F");
			}
	}
}
		// TODO Auto-generated method stub

	

