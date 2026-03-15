import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     switch (n) {
         case 1: System.out.println("Number is 1");break;
         case 2: System.out.println("Number is 2");break;
         case 3: System.out.println("Number is 3");break;
         case 4: System.out.println("Number is 4");break;
         default: System.out.println("-1");
     }

    }
}
