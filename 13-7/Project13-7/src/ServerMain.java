import java.net.ServerSocket;
import java.net.Socket;


//8189端口的服务器
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class ServerMain {
    public static void main(String[] args) {
        int i = 1;
        try {
            ServerSocket s = new ServerSocket(8189);
            for (; ; ) {
                Socket incoming = s.accept();
                System.out.println("Spawning " + i);
                new ThreadedEchoHandler(incoming, i).run(); //start()
                i++;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}