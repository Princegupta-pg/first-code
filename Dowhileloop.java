import java.util.Scanner;
public class Dowhileloop {
    public static void main(String[] args){
      int x = 15;
      int y = 12;
      y = x-1;
      do{
          System.out.println(x);
          x = y + (x - 2);
      }while(x<40);
    }
}
