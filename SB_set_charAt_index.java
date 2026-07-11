
//  StringBulder  Set Char At index 0
public class SB_set_charAt_index {
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder("Ram");
            System.out.println(sb);
        
            //charAt index 0
            System.out.println(sb.charAt(0));
            
            //sb set char at index 1
                sb.setCharAt(0, 'N');
                System.out.println(sb);
    }
}
