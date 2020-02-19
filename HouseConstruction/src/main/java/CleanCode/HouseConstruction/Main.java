package CleanCode.HouseConstruction;

import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		HouseConstruction obj=new HouseConstruction();
		int materialType,fullyAutomated=2;
		double areaInSquareFeet;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Available material types\n");
		System.out.printf("1.Standard materials\n2.Above standard materials\n3.High Standard material\n");
		System.out.printf("Choose a material type:");
		materialType=sc.nextInt();
		if(materialType==3)
		{
			System.out.printf("Do you want fully automated home\n1.yes 2.no  :");
			fullyAutomated=sc.nextInt();
			if(fullyAutomated!=1 && fullyAutomated!=2)
			{
				System.out.printf("Invalid choice\n");
				return;
			}
		}
		else if(materialType<1 || materialType>3)
		{
			System.out.printf("Invalid choice\n");
			return;
		}
		System.out.printf("Enter area in square feet:");
		areaInSquareFeet=sc.nextDouble();
		System.out.printf("Cost of constructions is:%.2f",obj.houseCost(materialType,fullyAutomated,areaInSquareFeet));
	}
}