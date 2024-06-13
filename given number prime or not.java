class Main{
  public Ststic void main(Strins args[]){

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
