import jav.util.scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
long num,fact,range;
        num = sc.nextLong();
        range =(int)Math.sqrt(num);
        for(fact=2;fact<=range;fact++) {
            if(num%fact==0) {
                System.out.println("not a prime number");
                break;
            }
        }
        if(fact>range){
            System.out.println("yes it  prime number");
        }
  }
}
