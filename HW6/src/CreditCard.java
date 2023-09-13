public class CreditCard {
    private int accountNumber;
    private double money;

    public CreditCard(int accountNumber, double money){
        this.accountNumber=accountNumber;
        this.money=money;
    }

    public void addMoney(double x){
        money+=x;
        System.out.println("Зачислено "+ x);
        System.out.println("На карте "+ money);
    }
    public void takeMoney(double x){
        money-=x;
        System.out.println("Снято "+ x);
        System.out.println("На карте "+ money);
    }
    public void viewInformation(){
        System.out.println("Номер карты "+ accountNumber);

        System.out.println("На карте "+ money);
    }

}
