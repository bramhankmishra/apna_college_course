import java.util.*;

public class prime_check {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check = ");
        int num = in.nextInt();
            if(num==2){
                System.out.print(num + " is a prime number.");
            }
            else {
                boolean isPrime = true;
                for (int i = 2; i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        isPrime = false;
                    }
                }
                if(isPrime== true){
                    System.out.print(num + " is a prime number.");
                }
                else{
                    System.out.print(num + " is not a prime number.");
                }
            }
    }
}