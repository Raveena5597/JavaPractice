import java.util.Scanner;
public class Numbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number from 0-9");
    int n =s.nextInt();
    if (n==1) {
      System.out.println(" /|");
      System.out.println("  |");
      System.out.println(" _|_");
    }
      else if(n==2) {
        System.out.println("--");
        System.out.println("  |");
        System.out.println("--");
        System.out.println("|  ");
        System.out.println("--");
      }
    else if (n==3) {
        System.out.println("-");
        System.out.println(" |");
        System.out.println("-");
        System.out.println(" |");
        System.out.println("-");
      }
      else if (n==4) {
        System.out.println("|  |");
        System.out.println(" --");
        System.out.println("   |");
      }
      else if (n==5) {
        System.out.println(" --");
        System.out.println("|  ");
        System.out.println(" --");
        System.out.println("   |");
        System.out.println("--");
      }
      else if (n==6) {
        System.out.println(" --");
        System.out.println("|  ");
        System.out.println(" --");
        System.out.println("|  |");
        System.out.println(" --");
      }
      else if (n==7) {
        System.out.println(" --");
        System.out.println("   |");
        System.out.println("   |");
      }
      else if (n==8) {
        System.out.println(" --");
        System.out.println("|  |");
        System.out.println(" --");
        System.out.println("|  |");
        System.out.println(" --");
      }
      else if (n==9) {
        System.out.println(" --");
        System.out.println("|  |");
        System.out.println(" --");
        System.out.println("   |");
        System.out.println("--");
      }
      else if (n==0) {
        System.out.println(" --");
        System.out.println("|  |");
        System.out.println("|  |");
        System.out.println(" --");
      }

      else {
        System.out.println("Please enter a valid number");
      }
  }
}
