import java.util.*;

public class typeconversion {
    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number");
            short sh = in.nextShort();
            System.out.print("The entered number is= ");
            int sh1 = sh;
            System.out.print(sh1);
            in.close(); // The close() is a method of Java Scanner class which is used to closes this scanner and flush out the memory.
            
        }
}

// We are taking a short as input and convert it to int type.

/* Implicit or widening or type_conversion in java is conversion of one data type to the other automatically by compiler,
here we need to keep 2 things in mind:
1. The types being converted should be compatible, that is, we can convert short to int but not char to int, although 
in both cases the former has larger size in memory than latter.
2. Size of [ Destination type > source type ].
Example: byte -> short -> int -> float -> long -> doub
 */

 /* Important note:  Type conversion, type casting and type promotion are all different terms */

// Type conversion(inplicit conversion) is : conversion of lower data type to higher compatible data type, by the compiler.

/* Type casting(explicit conversion) is : forced and mannual conversion of higher data type to the lower data type.
It can support : double -> float -> long -> int -> char -> short -> byte */

/* Type promotion : It is promotion of smaller data type to the larger data type in an expression. The smallest data type is 
converted to the largest data type present in the expression.*/ 