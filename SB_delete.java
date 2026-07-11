

//  StringBulder   delete Char At index 1
public class SB_delete  {
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder("Ram");
            System.out.println(sb);
        
            //SB Insert At index 1
            sb.insert(1, 'a');
            System.out.println(sb);
            
            // Delete a index at index 1
            sb.delete(1, 2);
            System.out.println(sb);
    }
}
