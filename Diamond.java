import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    char c = '*';
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = s.nextInt();
    int i,j,k,l;
    int space=n;
    for (i=1; i<=n ; i++) {
      //System.out.print("i");
      for (j=n; j>i ; j--) {
        //System.out.print("j");
          System.out.print(" ");
      }
    System.out.print("*");
      for (k=1; k<2*(i-1) ;k++) {
        //System.out.print("k");
          System.out.print(" ");
        }
           if( i==1) {
               System.out.println(" ");
           }
           else {
               System.out.println("*");
           }
       }
       for (i=n-1; i>=1 ; i--) {
         //System.out.print("i");
           for (j=n; j > i ; j--) {
             //System.out.print("j");
               System.out.print(" ");
           }
           System.out.print("*");
           for (k=1; k<2*(i-1) ;k++) {
             //System.out.print("k");
               System.out.print(" ");
           }
           if( i==1)
               System.out.println(" ");
           else
               System.out.println("*");
       }
}
}
