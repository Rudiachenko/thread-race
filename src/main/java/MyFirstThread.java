import org.apache.log4j.Logger;

public class MyFirstThread extends Thread {
    private static final Logger logger = Logger.getLogger(MyFirstThread.class);
    private final Incrementer incrementer;

    public MyFirstThread(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (incrementer.getValue() != incrementer.getMaxCount()) {
            incrementer.increment();
            logger.info(currentThread().getName() + " " + incrementer.getValue());
        }
    }
}
