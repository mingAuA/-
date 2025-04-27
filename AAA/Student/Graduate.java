package Student;

public class Graduate extends Student{
    @Override
    public void calculateGrade(int a, int b, int c) {

        int grade = a+b+c;
        if(a>90){
            System.out.println("语文成绩好，再接再厉"+"\n");
        }
        else if (a<60){
            System.out.println("语文成绩不及格，请好好学习"+"\n");
        }
        if(b>90){
            System.out.println("数学成绩好，再接再厉"+"\n");
        }
        else if (b<60){
            System.out.println("数学成绩不及格，请好好学习"+"\n");
        }
        if(c>90){
            System.out.println("英语成绩好，再接再厉"+"\n");
        }
        else if (c<60){
            System.out.println("英语成绩不及格，请好好学习"+"\n");
        }
        if(grade>250){
            System.out.println("总成绩优秀"+"\n");
        }
        else if (grade<200){
            System.out.println("不要气馁，请下次努力"+"\n");
        }
    }
}
