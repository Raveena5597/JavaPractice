import java.util.Scanner;
public class Array {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int []a = new int[length];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<length; i++ ) {
           a[i] = s.nextInt();
   }
        for (int i=0;i<a.length ;i++ ) {
        if(a[i]==a[i+1]) {
          System.out.println("Duplicate Element" +a[i]);
        }
      }
  }
}
