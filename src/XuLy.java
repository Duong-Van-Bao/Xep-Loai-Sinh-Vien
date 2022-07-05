import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
     /*
      * Bước 1: Tạo biến ten, diemToan, diemLy, diemHoa, diemTB, xepLoai
      * Bước 2: In thông báo nhập ten
      * Bước 3: Cho người dùng nhập và gán vào ten
      * Bước 4: In thông báo nhập diemToan
      * Bước 5: Cho người dùng nhập và gán vào diemToan
      * Bước 6: In thông báo nhập diemLy
      * Bước 7: Cho người dùng nhập và gán vào diemLy
      * Bước 8: In thông báo nhập diemHoa
      * Bước 9: Cho người dùng nhập và gán vào diemHoa
      * Bước 10: Tính điểm trung bình theo công thức 
      *            diemTB = (diemToan + diemLy + diemHoa)/3
      * Bước 11: Xem diemTB theo các điều kiện
      *            Điểm TB >= 8.5 -> loại Giỏi
      *            6.5 <= Điểm TB < 8.5 -> Loại khá
      *            5 <= Điểm TB < 6.5 -> loại TB
      *            Điểm TB < 5 -> Loại Yếu    
      * Bước 12: Xuất kết quả                
      * */
		String tenSV;
		float diemToan;
		float diemLy;
		float diemHoa;
		float diemTB;
		String xepLoai;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập vào tên: ");
		tenSV = scan.nextLine();
		
		System.out.println("Nhập điểm Toán: ");
		diemToan = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhập điểm Lý: ");
		diemLy = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhập điểm Hoa: ");
		diemHoa = Float.parseFloat(scan.nextLine());
		
        diemTB = (diemToan + diemLy + diemHoa)/3;
        
        //Bước 10: Tính điểm TB
        if(diemTB >= 8.5f) {
        	xepLoai = "Giỏi";
        } else if(diemTB > 6.5f) {
        	xepLoai = "Khá";
        } else if(diemTB >= 5) {
        	xepLoai = "Trung Bình";
        } else {
        	xepLoai = "Yếu";
        }
        /*
         * 1. Test 9 điểm
         * 2. Test 7 điểm
         * 3. Test 6 điểm
         * 4. Test 4 điểm
         * 5. 8.5
         * 6. 6.5
         * 7. Test 5
         * */
        
        System.out.println("Điểm Trung Bình " + diemTB +"\t Xếp loại: " + xepLoai);
	}

}
