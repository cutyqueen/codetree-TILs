import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        String a2 = sc.next();
        int b1 = sc.nextInt();
        String b2 = sc.next();

        if(a1>=19&&a2.equals("M") || b1>=19&&b2.equals("M")) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

    }
}