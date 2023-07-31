// type promomtion 

/* Type promotion : It is promotion of smaller data type to the larger data type in an expression. The smallest data type is 
converted to the largest data type present in the expression.
char + char = int
Java automatically promotes each byte, short or char data type to int when evaluating an expression.( int need not to be in the 
expression).
If one expression is long, float or double then whole expression is converted to long, float or double respestively. 
*/ 


public class type_promotion{
    public static void main(String args[]){
        char a='a';
        short b =18;
        byte c= (byte)(a + b);  /* error generated when type_casting not done -> incompatible types: possible lossy 
        conversion from int to byte (though int is not there at all) */
        System.out.println(c);

        



    }
}

// Simply we are trying to contain all the smaller data types into a type that can accomodate all the data types.