package LAB03;
import java.util.Scanner;
public class LAB03_Bai01_KiemTraSoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương: ");
        int soNguyenDuong = scanner.nextInt();
        System.out.println("===================================");
        // Kiểm tra số nhập vào có phải là số nguyên tố không
        boolean kt = true;
        if (soNguyenDuong <= 1) 
        	{
        		kt = false;
        	} 
        else 
        	{
            for (int i = 2; i <= Math.sqrt(soNguyenDuong); i++) 
            {
                if (soNguyenDuong % i == 0) 
                {
                    kt = false;
                    break;
                }
            }
        }

        // In kết quả ra màn hình
        if (kt) {
            System.out.println(soNguyenDuong + " là số nguyên tố.");
        } else {
            System.out.println(soNguyenDuong + " không phải là số nguyên tố.");
        }
	}

}
