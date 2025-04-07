import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class Service {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(1001);
        new Thread(()->{
            try {
                serverSocket.accept();
              System.out.println("Connected");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
