public class armstrong {
    public static void main(String args[]){
        int num=153;
        int temp=num;
        int sum=0;
        while(temp!=0){
        int digit=temp%10;
        sum=sum+digit*digit*digit;
        temp=temp/10;
        }
        if(num==sum)
        System.out.println("armstrong");
    else
        System.out.println("not armstrong");
    }
    
}
