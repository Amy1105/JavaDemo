public class DataType {

    //float / double 能表示的数值范围确实比 int / long 大。
    //但是，它们不能精确表示所有整数，尤其是超过一定大小的整数
    public static void main(String[] args) {
        int intValue;
        long longValue;
        float floatValue;
        double doubleValue;

        intValue = 1234567892;
        longValue = 1234567890123456789L;

        floatValue = intValue;
        doubleValue = intValue;

        System.out.println("int" + intValue);
        System.out.println("floatValue" + floatValue);
        System.out.println("doubleValue" + doubleValue);

        floatValue = longValue;
        doubleValue = longValue;

        System.out.println("long" + longValue);
        System.out.println("floatValue" + floatValue);
        System.out.println("doubleValue" + doubleValue);

    }
}