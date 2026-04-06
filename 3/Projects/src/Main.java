//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int b1 = 1;
        int b2 = 1;
        // 1 的二进制表示 00000000 00000000 00000000 00000001
        b1 <<= 31; //等价于 b1 = b1 << 31;。它的含义是将变量 b1 的二进制表示向左移动 31 位，然后将结果重新赋值给 b1
        //在 Java 的 int 类型中，最高位（最左边的位）是符号位。
        //符号位为 0 表示正数。
        //符号位为 1 表示负数。
        //10000000 00000000 00000000 00000000，也就是-2的31次方
        System.out.println("b1:" + b1);

        b2 <<= 31;
        System.out.println("b1:" + b2);
        // 10000000 00000000 00000000 00000000  右移31位，又变成 00000000 00000000 00000000 00000001
        b1 >>= 31;  //b1 =1
        System.out.println("b1:" + b1);
        b1 >>= 1;  // b1=b1>>1;
        System.out.println("b1:" + b1);
        b2 >>>= 31;
        System.out.println("b1:" + b2);
        b2 >>>= 1;
        System.out.println("b1:" + b2);
    }
}