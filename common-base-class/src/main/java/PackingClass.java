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

        //equals
        Long l1 = 1000L;
        boolean isEqual = l1.equals(1000L);//true
        isEqual = l1.equals(1000);//false

        Float f1 = 0.01f;
        Float f2 = 0.1f *0.1f;
        System.out.println(f1.equals(f2));//false
        System.out.println(f1 == f2);//false
        float f3 = 0.01f;
        float f4 = 0.1f *0.1f;
        System.out.println(f3 == f4);//false



    }
}
