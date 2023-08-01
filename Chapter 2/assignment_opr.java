public class assignment_opr{
    public static void main(String args[]){
        int a = 20,b = 10;  //=
        System.out.println(a+=b);               // +=
        System.out.println(a-=b);               //-=
        System.out.println(a*=b);               // *=  
        System.out.println(a/=b);               // /=
        System.out.println(a%=b);               // %=       
    }
}

// Note: I thought the value of a and b won't change since we are 
// just printing them, but it is changing with every statement.