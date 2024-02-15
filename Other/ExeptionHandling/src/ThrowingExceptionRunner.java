package UDEMY_JAVA.javaWorkSpace.ExeptionHandling.src;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency,  int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    // checked Exception을 throw 하는 경우 method가 signature에게 이 사실을 알려야 함.
    // 즉 method에서도, call 하는 method에서도 throws 해줘야함
    // unchecked Exception,즉 RuntimeException의 경우  안해도 됨.
    public void add(Amount that) throws CurrenciesDoNotMatchException {
        if(!this.currency.equals(that.currency)) {
//            throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);
            throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
        }
        this.amount = this.amount + that.amount;
    }

    public String toString() {
        return amount +  " " + currency;
    }

}

// extends RuntimeException을 extends해준다면 throws 안해줘도 됨.
class CurrenciesDoNotMatchException extends Exception {
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        System.out.println("sfsf");
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("ERU", 20);
        amount1.add(amount2);
        System.out.println(amount1);
        System.out.println("ggg");
    }
}
