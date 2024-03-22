import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        String inputStr = scanner.nextLine();
        
        // 3번째 문자부터 10번 문자까지 출력
        String outputStr = inputStr.substring(2, 10);
        
        // 출력
        System.out.println(outputStr);
        
        scanner.close();
    }
}