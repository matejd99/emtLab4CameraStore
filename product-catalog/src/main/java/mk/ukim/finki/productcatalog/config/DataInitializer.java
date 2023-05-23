package mk.ukim.finki.productcatalog.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.productcatalog.domain.models.Product;
import mk.ukim.finki.productcatalog.domain.repository.ProductRepository;
import mk.ukim.finki.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.sharedkernel.domain.financial.Money;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final ProductRepository productRepository;

    @PostConstruct
    public void initData() {
        Product p1 = Product.build("Gold whey protein", Money.valueOf(Currency.MKD,3290), 10);
        Product p2 = Product.build("BCAA", Money.valueOf(Currency.MKD,1790), 5);
        Product p3 = Product.build("Creatine", Money.valueOf(Currency.MKD,1390), 6);
        Product p4 = Product.build("C4 preworkout", Money.valueOf(Currency.MKD,2490), 8);
        if (productRepository.findAll().isEmpty()) {
            productRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
        }
    }
}
