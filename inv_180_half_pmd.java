//Pattern 
public class inv_180_half_pmd {
    public static void main(String[] args) {
        int n=4;
        //outer
        for(int i=1;i<=n;i++){
            //inner space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           //inner
           for (int j=1;j<=i;j++) {
               System.out.print("*");
           }
            System.out.println();
        }
    }    
}
