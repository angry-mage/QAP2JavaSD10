public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;
    }


    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long newDollars = this.dollars + otherAmount.dollars;
        long newCents = this.cents + otherAmount.cents;
        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents %= 100;
        }
        return new Money(newDollars, newCents);
    }

    public Money subtract(Money otherAmount) {
        long newDollars = this.dollars - otherAmount.dollars;
        long newCents = this.cents - otherAmount.cents;
        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents %= 100;
        }
        return new Money(newDollars, newCents);
    }

    public int compareTo(Money otherObject) {
        if (this.dollars < otherObject.dollars) {
            return 1;
        } else {
            if (this.dollars > otherObject.dollars) {
                return -1;
            } else {
                if (this.cents < otherObject.cents) {
                    return 1;
                } else {
                    if (this.cents > otherObject.cents) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }

    public boolean equals(Money otherObject){
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString(){
        return "$" + dollars + "." + (cents < 10 ? 0 : "") + cents;
    }

}
