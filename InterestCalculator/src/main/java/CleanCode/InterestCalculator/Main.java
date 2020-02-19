package CleanCode.InterestCalculator;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Interest obj;
		Scanner sc=new Scanner(System.in);
		int choice;
		float principalAmount,timePeriod,rateOfInterest;
		System.out.printf("Enter principal amount:");
		principalAmount=sc.nextFloat();
		System.out.printf("Enter time:");
		timePeriod=sc.nextFloat();
		System.out.printf("Enter rate:");
		rateOfInterest=sc.nextFloat();
		obj=new Interest(principalAmount,timePeriod,rateOfInterest);
		System.out.printf("Enter choice\n1.Simple Interest\t2.Compound Interest\n");
		choice=sc.nextInt();
		if(choice!=1 && choice!=2)
		{
			System.out.printf("Invalid choice\n");
		}
		else if(choice==1)
		{
			System.out.printf("Simple interest is: %.2f",obj.calculateSimpleInterest());
		}
		else
		{
			System.out.printf("Compound interest is: %.2f",obj.calculateCompoundInterest());
		}
	}
}