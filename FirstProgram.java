import java.util.Scanner;

public class FirstProgram {
  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = r.nextInt();
    System.out.println("Entered  number:"+n);
    for(int i=0;i<=n;i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
    }
   }
