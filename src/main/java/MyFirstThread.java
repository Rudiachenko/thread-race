import org.apache.log4j.Logger;

public class MyFirstThread extends Thread {
    private static final int MAX_COUNT = 100;
    private static final Logger logger = Logger.getLogger(MySecondThread.class);
    private final Incrementer incrementer;

    public MyFirstThread(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (incrementer.getValue() != MAX_COUNT) {
            incrementer.increment();
            logger.info(currentThread().getName() + " " + incrementer.getValue());
        }
    }
}
