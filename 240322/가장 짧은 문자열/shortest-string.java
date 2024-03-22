import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int a = str1.length();
        int b = str2.length();
        int c = str3.length();

        if(a>b&& b>c) {
            System.out.print(a-c);
        } else if(a>c&& c>b) {
            System.out.print(a-b);

        } else if(b>c&& c>a) {
            System.out.print(b-a);
        } else if(b>a&& a>c) {
            System.out.print(b-c);

        } else if(c>a&& a>b) {
            System.out.print(c-b);
        } else if(c>b&& b>a) {
            System.out.print(c-a);
        }
        

      
    }
}