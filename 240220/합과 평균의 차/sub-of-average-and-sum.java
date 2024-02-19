import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int i=a+b+c;
        int m=(a+b+c)/3;
        int n=i-m;

        System.out.println(i+"\n"+m+"\n"+n);
    }
}