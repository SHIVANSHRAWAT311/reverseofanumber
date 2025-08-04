import java.util.Scanner;
public class reverseofanumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int dig = 0;
        while(n!=0) {
            int rev = n % 10;
            dig = dig * 10 + rev;
            n = n / 10;

        }
        System.out.println(dig);
    }

}
