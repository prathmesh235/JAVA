//Pattern 
public class Inv_half_Pyramid {
    public static void main(String[] args) {
        int n=4;
        //outer
        for(int i=n;i>=1;i--){
            //inner
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
