//包装类
public class PackingClass {
    public static void forExample(){
        int i1 = 12345;
        //装箱
        Integer iObj = Integer.valueOf(i1);
        //拆箱
        int i2 = iObj.intValue();

        //自动装箱拆箱
        Integer a = 100;
        int b = a;



    }
}
