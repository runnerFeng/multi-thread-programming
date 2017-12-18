package feng;

/**
 * @author jinx
 * @date 2017/12/18
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread!");
    }
}
