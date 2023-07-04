import java.util.*;

class area_circle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are going to calculate the area of the circle.");
        System.out.print("Enter the diameter of the circle = ");
        float diameter = input.nextInt();
        System.out.print("The area of the circle is = ");
        System.out.print(3.14f*(diameter/2)*(diameter/2));
    }
}
// We also could have taken a variable of float type and storing the value of the same in it.
/* We have added a 'f' after 3.14 so that the compiler takes 3.14 as float and not as double. 
We will use it when assigning such value a variable of float type.*/
