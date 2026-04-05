import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class ThreadClient extends Frame implements Runnable , ActionListener {

    String ip, port;
    int no;
    Frame f;
    TextArea ta;
    TextField tf;
    Button send, bye;
    InputStream ins;
    Socket s;
    PrintStream out1;
    BufferedReader in;
    BufferedWriter out;

    public ThreadClient(String n, String m, int i) {
        ip = n;
        port = m;
        no = i;
    }


    @Override
    public void run() {
        f = new Frame("client NO." + no);
        f.setLayout(new FlowLayout());
        ta = new TextArea("", 10, 30, TextArea.SCROLLBARS_BOTH);
        tf = new TextField("", 20);
        send = new Button("send");
        bye = new Button("bye");

        send.addActionListener(this);
        bye.addActionListener(this);

        f.add(ta);
        f.add(tf);
        f.add(send);
        f.add(bye);
        f.setSize(300, 300);
        f.setVisible(true);

        Integer tmp = new Integer(port);
        int portint = tmp.intValue();

        try {
            s = new Socket(ip, portint);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out1 = new PrintStream(s.getOutputStream());
            ta.append(in.readLine());
            out1.println("hehe haha");
            ta.append((in.readLine() + "\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void send(String text) {
        try {
            out1.println(text);
            out1.flush();
            ta.append(in.readLine() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bye) {
            send("BYE");
            System.exit(0);
        }
        if (e.getSource() == send) {
            send(tf.getText());
        }
    }
}