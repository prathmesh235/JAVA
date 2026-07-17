
import java.util.Scanner;

public class cal_swicth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ope = sc.nextInt();

        switch (ope){

            case 1:System.out.println(a+b);
                break;

            case 2:System.out.println(a-b);
                break;

            case 3:System.out.println(a*b);
                break;
            
            case 4:if(b==0){
                System.out.println("Invailid No");
            }else{
                System.out.println(a/b);
            }
                break;

            case 5:if(b==0){
                System.out.println("Invalid NO");
        }else{    
            System.out.println(a%b);
        }
        break;
        }
    }
}
