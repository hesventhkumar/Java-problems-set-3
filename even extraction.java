import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 long num,pv=1,dig;
        num = sc.nextLong();
        while(num/pv!=0){
            pv=pv*10;
        }
        pv=pv/10;
//       System.out.println(pv);     //to get pv value
        while(pv!=0){

                    dig = (num / pv) % 10;
            if(dig%2==0) {        //  print even   number
                System.out.printf("%d %d\n", num, dig);
            }
                   pv = pv / 10;


        }

    }
}
