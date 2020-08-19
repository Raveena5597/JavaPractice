import java.util.Scanner;
public class Space{
  public static void main(String[] args) {
    char c = '*';
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = s.nextInt();
    int space=n;
    int i,j,k,l;
    for (i=1;i<=n ;i++ ) {
      for (j=i;j>=1 ;j-- ) {
        System.out.print(c);
      }
      for(k=0;k<(2*space-1);k++) {
        System.out.print(" ");
      }
      space--;
        for (l=i;l>=1;l--) {
          System.out.print(c);
       }
      System.out.println();
    }
  }
}
