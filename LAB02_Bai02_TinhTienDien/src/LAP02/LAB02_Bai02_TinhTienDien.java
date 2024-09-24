package LAP02;

import java.util.Scanner;

public class LAB02_Bai02_TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Khai báo các biến

		//Nhập dữ liệu từ bàn phím
		System.out.print("Nhập chỉ số điện cũ: ");
		int chiSoCu = scanner.nextInt();
		System.out.print("Nhập chỉ số điện mới: ");
		int chiSoMoi = scanner.nextInt();
		System.out.print("Nhập Đơn giá điện/kw: ");
		double donGia = scanner.nextDouble();
		int kwDienSD = chiSoMoi - chiSoCu;
		double thanhTien;
		//Công thức tính tiền điện tiêu thụ
		//Nếu số điện sử dụng < 50: tien = soDien*đơn giá
		//✓ Ngược lại: tien = 50*Đơn giá + (soDien - 50)*0.2*Đơn giá
		if(kwDienSD<50) 
		{
			thanhTien = kwDienSD* donGia;	
		}
		else 
		{
			thanhTien = (50*donGia) + ((kwDienSD - 50)*0.2*donGia);
		}
		//Xuất ra cho người dung
		System.out.println("Tiền điện phải thanh toán (VNĐ): " + thanhTien);
		System.out.println("--------------------------------------------------");
	}

}
