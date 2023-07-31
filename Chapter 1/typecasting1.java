import java.util.*;
public class typecasting1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number = ");
        float decimal = in.nextFloat();
        System.out.print("Entered number(float) = ");
        System.out.println(decimal);
        int new_integer = (int)(decimal);
        System.out.print("Number converte4d to Integer = ");
        System.out.println(new_integer);
        in.close();
    }
}
