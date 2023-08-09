import java.util.*;

public class floyd_triangle {
    public static void pattern(int size) {
        int out =1;
        for(int i=1; i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(out+" ");
                out++;
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the triangle = ");
        int size = in.nextInt();
        pattern(size);
    }
}