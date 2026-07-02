import java.util.Scanner;
//Pratice Q- Print the sum of n natural number 
public class sumloop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int sum = n;
    for(int i=0; i<n; i++){
    sum = sum + i;
    }
    System.out.println(sum);
    }
}
