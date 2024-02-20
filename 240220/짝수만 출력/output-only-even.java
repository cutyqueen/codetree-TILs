import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=a;
        while(count<=b) {
            if(count%2==0) {
                System.out.print(count+" ");
            }
            count++;
        }
    }
}