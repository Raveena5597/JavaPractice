import java.util.Scanner;
public class AtuEtu {
  public static void main(String[] args) {
    char c='*';
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = s.nextInt();
    for (int i=1;i<=n ;i++ ) {
      for (int j=i;j>=1 ;j-- ) {
        System.out.print(c);
      }
      System.out.print("\n");
    }
  }
}
