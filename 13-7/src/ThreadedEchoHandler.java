import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public  class ThreadedEchoHandler {
    private Socket incoming;
    private int counter;

    public ThreadedEchoHandler(Socket i, int c) {
        incoming = i;
        counter = c;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));

            PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);
            out.println("Hello!Enter BYE to exit.");
            boolean done = false;
            while (!done) {
                String str = in.readLine();
                if (str == null) {
                    done = true;
                } else {
                    out.println("Echo (" + counter + "):" + str);
                    if (str.trim().equals("BYE")) {
                        done = true;
                    }
                }
            }
            incoming.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}