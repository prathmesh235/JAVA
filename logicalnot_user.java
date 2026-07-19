import java.util.Scanner;

public class logicalnot_user {
    public static void main (String Args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         
        if(!(a<b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
