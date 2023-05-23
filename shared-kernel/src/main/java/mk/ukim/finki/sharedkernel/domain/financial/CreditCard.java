package mk.ukim.finki.sharedkernel.domain.financial;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class CreditCard implements ValueObject {
    private final String numOfCart;
    private final int yearFrom;
    private final int yearTo;

    protected CreditCard() {
        this.numOfCart = "";
        this.yearFrom = 0;
        this.yearTo = 0;
    }

    public CreditCard(String numOfCart, int yearFrom, int yearTo) {
        this.numOfCart = numOfCart;
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
    }

}
