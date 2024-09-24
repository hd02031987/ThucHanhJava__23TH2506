package ViDu_TinhBMI;

import java.util.Scanner;

public class ViDu_TinhBMI {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
// Tính chỉ số BMI
// Khai báo các biến
Scanner scanner = new Scanner(System.in);
System.out.print("Nhập họ tên: ");
String hoTen = scanner.nextLine();
System.out.print("Nhập chiều cao m: ");
double chieuCao = scanner.nextDouble();
System.out.print("Nhập cân nặng Kg :");
double canNang = scanner.nextDouble();
double bmi = chieuCao/Math.pow(canNang, 2);
if(canNang<=0) 
	{
	System.out.println("Chiều cao phải lớn hơn 0");
	return;
	}
else if(canNang<=0)
	{
	System.out.println("Cân nặng phải lớn hơn 0");
	return;
	}
else
	{
	System.out.println("BMI của " + hoTen + " là: " + bmi);
	}

	}

}
