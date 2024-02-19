import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phoneNumber = sc.next();

        // '-'를 기준으로 분리하여 각각의 부분을 정수로 변환
        String[] parts = phoneNumber.split("-");
        int x = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);

        System.out.print("010-" + y + "-" + x);
    }
}