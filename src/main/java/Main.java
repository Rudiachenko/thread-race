public class Main {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        MyFirstThread firstThread = new MyFirstThread(incrementer);
        firstThread.start();
        MySecondThread secondThread = new MySecondThread(incrementer);
        new Thread(secondThread).start();
    }
}
