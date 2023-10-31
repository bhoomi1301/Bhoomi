import java.util.Scanner;
class PrimeNumber{
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter a number: ");
          int num = scanner.nextInt();
 
          if(num<=1) {
          System.out.println(num + " is not a prime number");
          return;
       }

          for(int i=2; i<=num/2; i++) {
             if(num%i==0){
               System.out.println(num + " is not a prime number");
               return;
           }
      }
           System.out.println(num + " is a prime number");
       }
}
         
          