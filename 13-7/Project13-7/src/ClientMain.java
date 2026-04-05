import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMain extends Frame implements ActionListener {
    int i = 1;
    Frame f;
    TextField ip, port;
    Label Lip, Lport;
    Button connect, exit;

    public static void main(String[] args) {
        ClientMain cl = new ClientMain();
        cl.init();
    }

    public void init() {
        f = new Frame("client connection");
        f.setLayout(new FlowLayout());
        ip = new TextField("127.0.0.1", 20);
        port = new TextField("8189", 5);
        Lip = new Label("ip address");
        Lport = new Label("port");
        connect = new Button("connect");
        exit = new Button("exit");
        connect.addActionListener(this);
        exit.addActionListener(this);
        f.add(Lip);
        f.add(ip);
        f.add(Lport);
        f.add(port);
        f.add(connect);
        f.add(exit);
        f.setSize(500, 60);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        }
        if (e.getSource() == connect) {
            new Thread(new ThreadClient(ip.getText(), port.getText(), i)).run();
        }
    }
}