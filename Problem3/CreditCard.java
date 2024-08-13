public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance(){
        return balance;
    }

    public Money getCreditLimit(){
        return creditLimit;
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money amount){
        Money newBalance  = amount.add(balance);
        if(newBalance.compareTo(creditLimit) >= 0){
            balance = newBalance;
        } else {
            System.out.println("Error: Charge exceeds credit limit.");
        }
    }

    public void payment(Money amount){
        if(balance.compareTo(amount) <= 0){
           balance = balance.subtract(amount);
        } else {
            System.out.println("Error: Payment exceeds current balance.");
        }
    }
}
