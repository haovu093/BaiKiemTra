import java.util.Scanner;

public class Bai2 {

    void nhapMatKhau() {
        Scanner sc = new Scanner(System.in);
        String passwd;
        System.out.println("Nhập pass:");
        passwd=sc.nextLine();
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}";
        if (passwd.matches(pattern))
        {
            System.out.println("Mật khẩu hợp lệ");
        }
        else System.out.println("Mật khẩu k hợp lệ");

    }
}

