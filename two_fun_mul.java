
import java.util.Scanner;

//Function
public class two_fun_mul {
    public static int Mul(int a,int b) {
        int Mul=a*b;
        return Mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        int Mul= Mul (a,b);
        System.out.println("Multiplication of two no:"+Mul);
    }
}
