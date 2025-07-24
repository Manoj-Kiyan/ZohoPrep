
import java.time.Duration;
import java.time.LocalDateTime;

public class SimpleFeeCalculator implements FeeCalculator {
    public double calculate(LocalDateTime in, LocalDateTime out) {
        long seconds = Duration.between(in, out).getSeconds();
        return Math.max(10, seconds * 0.1); // Rs.0.1 per second, min Rs.10
    }
}
