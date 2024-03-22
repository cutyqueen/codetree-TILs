import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int a = str1.length();
        int b = str2.length();

        if(a>b) {
            System.out.print(str1+" "+a);
        } else if(a<b) {
            System.out.print(str2+" "+b);
        } else if(a==b) {
            System.out.print("same");
        }
        

      
    }
}