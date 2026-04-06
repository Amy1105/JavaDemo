//阶乘
public class Factorial {
   private   int result=1,intValue;
    public  static void main(String[] args) {
        Factorial ff = new Factorial();
        ff.setIntValue(6);
        ff.Cal();
        ff.print();
    }

    void setIntValue(int n)
    {
        intValue=n;
    }

    int getIntValue()
    {
        return intValue;
    }

    void Cal()
    {
        if(intValue==0) result= 1;
        for(int i=1;i<=intValue;i++)
        {
            result=result*i;
        }
    }

    void print()
    {
        System.out.println(result);
    }

}
