import java.util.Scanner;
public class CharStar {
  public static void main(String[] args) {
    char c ='*';
    char a ='A';
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = s.nextInt();
    for (int i=n;i>=1;i--) {
      for (int j=i;j>=1;j--) {
        System.out.print(" ");
      }
      for (int k=i;k<=n;k++){
        System.out.print(c);
      }
      System.out.println();
    }
  }
}
