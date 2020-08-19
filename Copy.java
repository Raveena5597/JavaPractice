import java.util.*;
public class Copy{
   public static void main(String[] args) throws Exception {
    Scanner inr = new Scanner(System.in);
    System.out.println("Enter any number between 0-9");
    char c = inr.next().charAt(0);
  if(c=='2'||c=='3'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
   System.out.println(" _ ");
  else
   System.out.println("   ");
  if(c=='4'||c=='5'||c=='6'||c=='8'||c=='9'||c=='0')
   System.out.print("|");
  else
   System.out.print(" ");
  if(c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='8'||c=='9')
   System.out.print("_");
  else
   System.out.print(" ");
  if(c=='1'||c=='2'||c=='3'||c=='4'||c=='7'||c=='0'||c=='8'||c=='9')
    System.out.println("|");
   else
    System.out.println(" ");
  if(c=='6'||c=='2'||c=='8'||c=='0')
   System.out.print("|");
  else
   System.out.print(" ");
  if(c=='2'||c=='3'||c=='5'||c=='6'||c=='8'||c=='9'||c=='0')
   System.out.print("_");
  else
   System.out.print(" ");

  if(c=='1'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
   System.out.println("|");
  else
   System.out.println(" ");
   }
}
