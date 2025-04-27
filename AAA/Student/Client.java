package Student;

import java.util.Scanner;

public class Client {
    public void display(int a, int b, int c) throws InvalidScoreException {
        if (a > 100 || a < 0) throw new InvalidScoreException(a, "语文");
        if (b > 100 || b < 0) {
            throw new InvalidScoreException(b, "数学");
        }
        if (c > 100 || c < 0) {
            throw new InvalidScoreException(c, "英语");
        }
        System.out.println("总分数为" + (a + b + c));
    }

    public void judgeGrade(int a, int b, int c) {
        try {
            display(a, b, c);
        } catch (InvalidScoreException e) {
            //getMessage()用于获取异常创建时设置的错误消息内容。
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("请输入数学成绩: ");
            int math = sc.nextInt();
            System.out.print("请输入英语成绩: ");
            int english = sc.nextInt();
            System.out.print("请输入语文成绩: ");
            int chinese = sc.nextInt();

            Client client = new Client();
            client.judgeGrade(math, english, chinese);
            Graduate graduate = new Graduate();
            graduate.calculateGrade(math, english, chinese);
        } catch (Exception e) {
            System.err.println("输入有误，请输入有效的整数成绩。");
        }
    }
}
