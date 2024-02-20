import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a%3==0 && a%5==0) {
            System.out.println("YES");
            System.out.println("YES");
        } else if(a%3!=0 && a%5==0) {
            System.out.println("NO");
            System.out.println("YES");
        } else if(a%3==0 && a%5!=0) {
            System.out.println("YES");
            System.out.println("NO");
        } else if(a%3!=0 && a%5!=0) {
            System.out.println("NO");
            System.out.println("NO");
        }

    }
}