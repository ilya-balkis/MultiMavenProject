import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class SecondClass {

    private static Logger logger = LoggerFactory.getLogger("second");

    public static void main(String[] args) {
        ThirdClass thirdClass = new ThirdClass();
        logger.info("Create class: " + thirdClass.getClass());

        thirdClass.setDay(14);
        thirdClass.setMonth(12);
        thirdClass.setYear(2000);
        logger.info("Set date");

        thirdClass.printDate();
        logger.info("Print date");
    }
}
