package java8.learn.parallel.pk2;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class Demo {
  public static void main(String[] args) {
    long parallerTime = 0;
    long sequentilTime = 0;
    long time;
    BigDecimal sum;

    for (int i = 0; i <= 5; i++) {
      time = System.currentTimeMillis();
      sum = Stream.generate(() -> new BigDecimal(Math.random() * 10000))
              .limit(1000000)
              .parallel()
              .map(bigDecimal -> bigDecimal.multiply(BigDecimal.TEN))
              .reduce(BigDecimal.ZERO, (a, b) -> a.add(b));


      if (i > 0) {
        sequentilTime += (System.currentTimeMillis() - time);
      }
    }
    System.out.println("Average time for parallel calc " + (parallerTime / 5));
    System.out.println("Average time for sequental calc " + (sequentilTime / 5));

  }
}
