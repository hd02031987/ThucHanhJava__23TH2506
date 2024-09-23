package aLap01_Bai01;
import java.util.Scanner;
public class Lap01_Bai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
