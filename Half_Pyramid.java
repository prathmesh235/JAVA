//Pattern Half Pyramid
public class Half_Pyramid{
    public static void main(String[] args) {
        int p=4;
        //outer 
            for(int i=1;i<=p;i++){
                //inner
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }       
}