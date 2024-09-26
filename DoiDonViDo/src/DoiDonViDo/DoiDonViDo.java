package DoiDonViDo;

import java.util.Scanner;

public class DoiDonViDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
//Đổi đơn vị đo Km ----> m và Byte ----> Bit
System.out.print("Nhập vào số Km:" );
double km = scanner.nextDouble();
System.out.print("Nhập vào số Byte: ");
int zbyte = scanner.nextInt();
double met = km * 1000;
int bit = zbyte*8;
//Xuất ra màn hình
System.out.println("==========================");
System.out.println(km +" km = " + met+" m");
System.out.println(zbyte + " byte = " + bit+" bit");
	}
	

}
