    abstract class payment{
    protected double amount;
    payment(double amount){
    this.amount=amount;
}
    abstract void pay();
    void recipt(){
        System.out.println("Recipt generated");
        System.out.println("Amount paid:" +amount);
    }
    void showpaymentstatus(){
    System.out.println("payment successfully");
    }
}
    class upiPayment extends payment{
    private String upiId;
    upiPayment(double amount,String upiId)
    {
        super(amount);
        this.upiId=upiId;
    }
    void pay(){
        System.out.println("processing UPI Payment");
        System.out.println("upiID:" +upiId);
    }
}
    class cardpayment extends payment{
    private String cardNumber;
    cardpayment(double amount,String cardNumber)
    {
        super(amount);
        this.cardNumber=cardNumber;
}
    void pay(){
        System.out.println("processing Card Payment");
        System.out.println("cardnumber:4565545454"+cardNumber.substring(cardNumber.length()));
    }
}
    public class Main{
      public static void main(String[]args){
        payment p1=new upiPayment(5500.78,"jithin@iob");
        payment p2=new cardpayment(3569.90,"123456789879");
        p1.pay();
        p1.recipt();
        p1.showpaymentstatus();
        System.out.println();
        p2.pay();
        p2.recipt();
        p2.showpaymentstatus();
      }
}
    
    
