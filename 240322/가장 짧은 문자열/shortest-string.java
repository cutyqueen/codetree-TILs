import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    
    String s1 = sc.next();
    String s2 = sc.next();
    String s3 = sc.next();
    
    int len[] = {s1.length(),s2.length(),s3.length()};
    int min = len[0];
    int max = len[0]; 
    
    for (int i = 0; i < len.length; i++) {
      if(len[i]<=min) {
        min=len[i];
      }
      if(len[i]>=max) {
        max=len[i];
      }
    }
    System.out.println(max-min);
    
    
  }
}