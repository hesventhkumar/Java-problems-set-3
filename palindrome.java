import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
long dig,num,res=0,pv=1;
        num=sc.nextLong();   //1001
        while(num/pv!=0) {
            dig=(num/pv)%10; //1=0=0=1
            res=res*10+dig;  //1=10=100=1001
            pv=pv*10;        //10=100=1000
        }
        if(res==num){         //1001=1001
            System.out.println("YES");
        }
        else
            System.out.println("NO");




    }
}


