public class clr_bit{
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int notbitMask=~(bitMask);

        int newNumber=notbitMask & n;
        System.out.println(newNumber);
    }
}
