import java.net.ServerSocket;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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