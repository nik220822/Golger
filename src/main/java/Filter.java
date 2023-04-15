import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
//        source.stream().filter(x -> x > threshold).forEach(result::add);
        for (int number : source
        ) {
            if (number > threshold) {
                result.add(number);
                logger.log("Число " + number + " прошло порог");
            }else {
                logger.log("Число " + number + " не прошло порог");
            }
        }
        return result;
    }
}
