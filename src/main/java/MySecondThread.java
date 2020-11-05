import org.apache.log4j.Logger;

public class MySecondThread implements Runnable {
    private static final int MAX_COUNT = 100;
    private static final Logger logger = Logger.getLogger(MySecondThread.class);
    private Incrementer incrementer;

    public MySecondThread(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (incrementer.getValue() != MAX_COUNT){
            incrementer.increment();
            logger.info("Thread-1 " + incrementer.getValue());
        }
    }
}