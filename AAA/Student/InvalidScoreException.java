package Student;

public class InvalidScoreException extends Exception{
    int a;
    String b;

    public InvalidScoreException(int a , String b) {
        //将一个拼接好的描述性错误信息传递给父类构造函数，用于在抛出异常时提供清晰的错误提示，表明传入的成绩不在 0 - 100 的合法范围内 。
        super ("无效的" + b + "成绩:" + a + "，成绩应在 0 到 100 之间。");
    }
    }
