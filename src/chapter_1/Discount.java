package chapter_1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Discount {
    private static final List<BigDecimal> prices = Arrays.asList(bd(10), bd(30), bd(17), bd(20), bd(15), bd(18), bd(45), bd(12));

    public static BigDecimal discountOver20Imperative () {
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
        BigDecimal twenty = BigDecimal.valueOf(20);
        BigDecimal ninetyPercent = BigDecimal.valueOf(.9);

        for (BigDecimal price : prices) {
            if (price.compareTo(twenty) > 0) {
                totalOfDiscountedPrices =
                        totalOfDiscountedPrices.add(price.multiply(ninetyPercent));
            }
        }

        return totalOfDiscountedPrices;
    }

    public static BigDecimal discountOver20Declarative () {
        BigDecimal twenty = BigDecimal.valueOf(20);
        BigDecimal ninetyPercent = BigDecimal.valueOf(.9);

        return prices.stream()
                .filter(price -> price.compareTo(twenty) > 0)
                .map(price -> price.multiply(ninetyPercent))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }


    private static BigDecimal bd(int makeBD) {
        return new BigDecimal(makeBD);
    }
}
