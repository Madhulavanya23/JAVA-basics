import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an year ");
        int y=sc.nextInt();
        if(y%4==0)
            System.out.println(y+"is leap year");
        else
            System.out.println(y+ " is not a leap year");
        
    }
    
}
