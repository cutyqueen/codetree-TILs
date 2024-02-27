import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        int age = sc.nextInt();
        for (; age >= 20 && age < 30; age = sc.nextInt()) {
            sum += age;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.printf("%.2f", avg);
        }
    }
}