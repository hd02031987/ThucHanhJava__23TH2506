package aHinhChuNhat;

import java.util.Scanner;

public class HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
//Nhập chiều dài hình chữ nhật
System.out.print("Nhập chiều dài: ");
double Chieudai = scanner.nextDouble();
System.out.print("Nhập chiều rộng: ");
double Chieurong = scanner.nextDouble();
//Tính chu vi hình chữ nhật
double ChuVi = (Chieudai + Chieurong)*2;
//Tính diện tích hình chữ nhật
double DienTich = Chieudai * Chieurong;
//Xác định cạnh nhỏ
double CanhNho = Math.min(Chieudai, Chieurong);
//Xuất ra màn hình
System.out.println("Chiều dài hình chữ nhật: " + Chieudai);
System.out.println("Chiều rộng hình chữ nhật: " + Chieurong);
System.out.println("Chu vi hình chữ nhật: " + ChuVi);
System.out.println("Diện tích hình chữ nhật: " + DienTich);
System.out.println("Cạnh nhỏ nhất: " + CanhNho);
	}

}
