public class Incrementer {
    private static final int MAX_COUNT = 100;
    private int value;

    public void increment(){
        value++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static int getMaxCount() {
        return MAX_COUNT;
    }
}
