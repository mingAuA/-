package Countdown;

public class CountdownThread extends Thread {
    private int count;

    public CountdownThread(int count) {
        this.count = count;
    }
    public void run() {
        for (int i = count; i > 0; i--) {
            System.out.println("倒计时:" + i + "秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("倒计时结束");
    }
}
