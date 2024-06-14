import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     long num,pv=1,dig,sum=0;
         num = sc.nextLong();
          while(num!=0){
              dig=num%10;
              sum=sum+dig;
              num=num/10;
          }
          System.out.println(sum);




    }
}
