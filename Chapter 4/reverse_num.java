import java.util.*;
                                            // In this code we are reversing number by printing digits from the end one by one.
public class reverse_num {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number = ");
        long num = in.nextLong();
        long reverse;
        for(int i = 0; num!=0;i++){
            reverse = num%10;
            num = num/10;
            System.out.print(reverse);
        }                    
          // System.out.println(reverse);
        }
    }