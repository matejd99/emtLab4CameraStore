package mk.ukim.finki.payment.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.financial.CreditCard; 
import java.util.Date;

@Entity
@Table(name = "payment")
@Getter
public class Payment extends AbstractEntity<PaymentId> {
    private String method;
    private int total;
    private Date transactionDate;
    private CreditCard creditCard;


    public Payment() {
        super(PaymentId.randomId(PaymentId.class));
    }

    public static Payment build(String method, int total, int i, Date transactionDate, CreditCard creditCard) {
        Payment paymemt = new Payment();
        paymemt.method=method;
        paymemt.total=total;
        paymemt.transactionDate=transactionDate;
        paymemt.creditCard=creditCard;
        return paymemt;
    }
}