//Defining a array by method 1
public class def1_array {
    public static void main(String[] args) {
        //type[] array.name=new type[size]

        int marks[]=new int[3];
            marks[0]=90;
            marks[1]=70;
            marks[2]=99;
            
            //System.out.println(marks[0]);
            //System.out.println(marks[1]);
            //System.out.println(marks[2]);
            for( int i=0;i<3;i++){
                System.out.println(marks[i]);
            }
    }
}
