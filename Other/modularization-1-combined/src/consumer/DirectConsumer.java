package consumer;

import sorting.algorithm.BubbleSort;
import sorting.util.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {
    private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
    public static void main(String[] args) {
        BubbleSort util = new BubbleSort();
        List<String> sorted = util.sort(List.of("jihun", "Ravi", "Eve", "ADarm"));
        logger.info(sorted.toString());

    }
}
