import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  long num,dig,rev=0;  //num=12345
        num = sc.nextLong();
        while(num!=0){
            dig=num%10;       //dig=5=4
            rev=rev*10+dig;    //rev=5=4
            num=num/10;         // num=1234=123
        }
        System.out.print(rev);




    }
}
