package aGiaiPTBac2;

import java.util.Scanner;

public class GiaiPTBac2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Phương trình bậc 2 có dạng: ax^2 + bx + c = 0");
		Scanner scanner = new Scanner(System.in);
		//Nhập giá trị a
System.out.print("Nhập giá trị a: ");
double a = scanner.nextDouble();
System.out.print("Nhập giá trị b: ");
double b = scanner.nextDouble();
System.out.print("Nhập giá trị c: ");
double c = scanner.nextDouble();
//Tính giá trị Delta
double Delta = Math.pow(b, 2) - 4*a*c;
System.out.println("Delta = " + Delta);
//Xét điều kiện Delta
		if (Delta > 0) 
			{
				double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} 
		else if (Delta == 0) 
			{
				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
			}
		else 
		{
			System.out.println("Phương trình vô nghiệm");
		}
	}

}
