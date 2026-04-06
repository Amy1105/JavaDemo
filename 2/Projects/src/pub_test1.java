public class pub_test1 {

    float fvar1;
    float fvar2;
    int ivar1;

    public  void setFvar1(float f){
        fvar1=f;
    }

    public  void setIvar1(int i){
        ivar1=i;
    }
    public  void sum_f_I()
    {
        fvar2=fvar1+ivar1;
    }

    public  void print (){
        System.out.println("fvar1:"+fvar1+"+ ivar1:"+ivar1+"=fvar2:"+fvar2);
    }
}
