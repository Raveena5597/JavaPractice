import java.util.Scanner;
public class DOB{
  public static void main(String[] args){
    int currentYear = 2020;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your Year of Birth");
    int yOB = s.nextInt();
    int age = currentYear-yOB;
    System.out.println(" Years "+age);
}
}
