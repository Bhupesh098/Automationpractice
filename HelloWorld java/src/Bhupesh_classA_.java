import java.util.Scanner;
public class Bhupesh_classA_ {
    public static void main(String[] args) {
        int n,s=0,c,r;
        System.out.println("Enter any number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;
        while (n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (c==s)
            System.out.println("palindrome Number");
        else
            System.out.println("Not palindrome Number");
    }
}
