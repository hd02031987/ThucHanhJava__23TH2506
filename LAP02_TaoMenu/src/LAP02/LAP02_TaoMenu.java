package LAP02;

import java.util.Scanner;

public class LAP02_TaoMenu {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int chon;

        do {
            System.out.println("Menu:");
            System.out.println("1. Bài tập 1");
            System.out.println("2. Bài tập 2");
            System.out.println("3. Bài tập 3");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    baiTap1();
                    break;
                case 2:
                    baiTap2();
                    break;
                case 3:
                    baiTap3();
                    break;
                case 4:
                    System.out.println("Kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }
        } while (chon != 4);
    }

    // Các phương thức thực hiện các bài tập
    public static void baiTap1() {
        // Code cho bài tập 1package aHinhChuNhat;
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
        System.out.println("Bạn đã chọn bài tập 1");
    }

    public static void baiTap2() {
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
        System.out.println("Bạn đã chọn bài tập 2");
    }

    public static void baiTap3() {
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
        System.out.println("Bạn đã chọn bài tập 3");
	}

}
