import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        String Mssv;
        System.out.println("nhap vao MSSV");
        Scanner sc = new Scanner(System.in);
        Mssv = sc.nextLine();
        if (Mssv.matches("B\\d{7}")){
            System.out.println("phu hop");
        }else {
            System.out.println("khong phu hop");
        }
    }
}
