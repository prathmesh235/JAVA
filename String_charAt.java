
public class String_charAt {
    public static void main(String[] args) {
        String FirstName = "Ram";
        String LastName = "Shinde";
        String FullName = FirstName+" "+LastName ;
        //Ram Shinde
        System.out.println(FullName.length());
        for(int i=0;i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }
    }
}
