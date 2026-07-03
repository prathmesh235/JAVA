//Pattern Hollow Rectangle

public class Hollow_Rect{
    public static void main(String[] args) {
        int s=4;
        int p=5;
        //outer side
        for(int i=1;i<=s;i++){
        //inner side
        for(int j=1;j<=p;j++){
            if(i==1||j==1||i==s||j==p){
                System.out.print("*");
        } else{
            System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}