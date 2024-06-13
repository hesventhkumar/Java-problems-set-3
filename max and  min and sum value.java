
class Main{
public static void main(String args[]){
int num,sum=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while(true){
            num = sc.nextInt();
            if(num==-1)
                break;
            sum= sum+num;
            if(num<min)
                min=num;
            if(num>max)
                max=num;

        }
        System.out.println("MAX:"+ max);
        System.out.println("MIN;"+min);
        System.out.println("SUM;"+sum);
}
}
