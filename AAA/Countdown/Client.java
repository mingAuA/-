package Countdown;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入倒计时时间:");
       int a = scanner.nextInt();
        CountdownThread countdownThread = new CountdownThread(a);
       countdownThread.start();

    }
}
