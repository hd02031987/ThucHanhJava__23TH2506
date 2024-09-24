package aTheTichHinhLapPhuong;

import java.util.Scanner;

public class TheTichHinhLapPhuong {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
//Nhập cạnh của hình lập phương
System.out.print("Nhập cạnh hình lập phương:" );
double Canh = scanner.nextDouble();
//Tính thể tích của hình lập phương
double TheTich = Math.pow(Canh, 3);
//Xuất thể tích của hình lập phương
System.out.println("Thể tích hình lập phương là: " + TheTich);
	}

}
