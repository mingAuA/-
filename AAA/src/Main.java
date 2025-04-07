import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) throws  Exception {
        Socket socket=new Socket("localhost",1001);
        PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));


    }
}