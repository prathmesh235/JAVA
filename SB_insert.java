

//  StringBulder   insert Char At index 1
public class SB_insert  {
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder("Ram");
            System.out.println(sb);
        
            //SB Insert At index 1
            sb.insert(1, 'a');
            System.out.println(sb);
    }
}
