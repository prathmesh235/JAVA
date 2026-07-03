//Pattern Solid Rectangle

public class Rect{
    public static void main(String[] args) {
        int p = 4;
        int q = 5;
        // outer side
        for(int i=1;i<=p;i++){
            //inner side
            for(int j=1;j<=q;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}