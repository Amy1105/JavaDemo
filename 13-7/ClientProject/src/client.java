import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class client extends Frame implements ActionListener  {
    int i = 1;
    Frame f;
    TextField ip, port;
    Label Lip, Lport;
    Button connect, exit;

    public static void main(String[] args) {
        client cl = new client();
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
            new Thread(new threadClient(ip.getText(), port.getText(), i)).run();
        }
    }
}