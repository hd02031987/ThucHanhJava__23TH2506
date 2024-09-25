package LAP02;

import java.util.Scanner;

public class LAP02_TaoMenu {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int chon;

        do {
            System.out.println("==========MENU==========");
            System.out.println("------------------------");
            System.out.println("1. Chu vi, diện tích hình chữ nhật");
            System.out.println("2. Tính tiền điện");
            System.out.println("3. Giải phương trình bậc 2");
            System.out.println("4. Tính BMI");
            System.out.println("5. Nhập xuất điểm trung bình");
            System.out.println("6. Giải phương trình bậc 1");
            System.out.println("7. Chu vi, diện tích hình tròn");
            System.out.println("8. Bài tập Nhập xuất từ bàn phím");
            System.out.println("9. Bài tập làm quen với ngôn ngữ JaVa");
            System.out.println("10. Thoát");
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
                    baiTap4();
                    break;
                case 5:
                    baiTap5();
                    break;
                case 6:
                    baiTap6();
                    break;
                case 7:
                    baiTap7();
                    break;
                case 8:
                    baiTap8();
                    break;
                case 9:
                    baiTap9();
                    break;
                case 10:
                    System.out.println("Kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }
        } while (chon != 10);
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
    public static void baiTap4() 
    {
    	Scanner scanner = new Scanner(System.in);
		String thongBao = null;
		System.out.print("Nhập họ tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Nhập chiều cao m: ");
		double chieuCao = scanner.nextDouble();
		System.out.print("Nhập cân nặng Kg :");
		double canNang = scanner.nextDouble();
		//Công thức tính BMI
		double bmi = canNang/Math.pow(chieuCao, 2);	
		System.out.println("BMI của " + hoTen + " là: " + bmi);
		if(bmi<16) {
			thongBao = "Gầy mức độ III";}
		else if(bmi<17) 
		{ thongBao = "Gầy mức độ II";}
		else if
		(bmi<18.5) { thongBao = "Gầy mức độ I";}
		else if(bmi<25) 
		{thongBao = "Bình thường";}
		else if(bmi<30) 
		{thongBao = "Thừa cân";}
		else if(bmi<35) 
		{thongBao = "Béo phì mức độ I";}
		else if(bmi<40) 
		{thongBao = "Béo phì mức độ II";}
		else if(bmi>16) 
		{thongBao = "Béo phì mức độ III";}		
		System.out.println(thongBao);
    }
    public static void baiTap5() 
    {
    	Scanner scanner = new Scanner(System.in);


        // Nhập họ và tên
        System.out.print("Nhập họ và tên SV: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        // Xuất kết quả
        System.out.println(hoTen + " đạt " + diemTrungBinh + " điểm");

        scanner.close();
    }
    public static void baiTap6() 
    {
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
    public static void baiTap7() 
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Nhập bán kính: ");
    	double banKinh = scanner.nextDouble();
    	double duongKinh = banKinh*2;
    	double chuVi = duongKinh*Math.PI;
    	double dienTich = Math.pow(banKinh,2)*3.14;
    	// Xuất ra màn hình
    	System.out.println("==============================");
    	System.out.println("Chu vi hình tròn: " + chuVi);
    	System.out.println("Diện tích hình tròn: " + dienTich);
    } 
    public static void baiTap8() 
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Nhập họ tên:");
    	String hoTen = scanner.nextLine();
    	System.out.print("Tuổi: ");
    	int tuoi = scanner.nextInt();
    	System.out.print("Cân nặng (Kg): ");
    	double canNang = scanner.nextDouble();
    	System.out.print("Chiều cao (cm): ");
    	double chieuCao = scanner.nextDouble();
    	//Xuất thông tin nhập
    	System.out.println("------------------------------------------");
    	System.out.println("Họ và tên: " + hoTen);
    	System.out.println("Tuổi: " + tuoi);
    	System.out.println("Cân nặng: " + canNang);
    	System.out.println("Chiều cao: " + chieuCao);
    }
    public static void baiTap9() 
    {
    	int a = 5;
    	int b = 6;
    	int c = a + b;
    	System.out.println("a + b = " + c);
    	System.out.println("Hôm nay học Java, Nhập môn còn hơi bỡ ngỡ.");
    }
}
