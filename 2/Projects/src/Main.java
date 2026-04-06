//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        pub_test1 pub=new pub_test1();
        pub.setFvar1(345f);
        pub.setIvar1(56);
        pub.sum_f_I();
        pub.print();
    }
}
