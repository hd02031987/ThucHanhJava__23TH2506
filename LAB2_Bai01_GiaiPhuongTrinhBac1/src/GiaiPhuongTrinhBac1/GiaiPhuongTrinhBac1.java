package GiaiPhuongTrinhBac1;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Phương trình bậc nhất có dạng ax + b=0");
System.out.println("-----------------------------------------");
//Khai báo biến
Scanner scanner = new Scanner(System.in);
System.out.print("Nhập giá trị a: ");
double a = scanner.nextDouble();
System.out.print("Nhập giá trị b: ");
double b = scanner.nextDouble();
double x = -b/a;
if(a==0) 
	{ 
	if(b==0)
		{
		System.out.println("Phương trình vô số nghiệm");
		}
	else 
		{
		System.out.println("Phương trình vô nghiệm");
		}
	}
else 
	{
	System.out.print("Nghiệm của phương trình là: " + x);
	}
	}

}
