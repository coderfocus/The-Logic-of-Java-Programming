import java.util.Date;
import java.util.TimeZone;

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

        //不可变性
        Integer a1 = 100;
        Integer b1 = a1;
        System.out.println(b1);
        a1 = 50;
        System.out.println(b1);

        String s1 ="coder";
        String s2 = s1;
        System.out.println(s2);
        s1 = "focus";
        System.out.println(s2);

        //字符串常量池
        String name1 = "coderfocus";
        String name2 = "coderfocus";
        System.out.println(name1 == name2);//true
        System.out.println(name1.equals(name2));//true

        String name3 = new String("coderfocus");
        String name4 = new String("coderfocus");
        System.out.println(name3 == name4);//false
        System.out.println(name3.equals(name4));//true


        //字符串拼接
        StringBuilder stringBuilder = new StringBuilder();
        String str = null;
        stringBuilder.append(str);
        System.out.println(stringBuilder.toString());

        //表示时刻 绝对时间
        Date now = new Date();
        Date now1 = new Date();
        //返回毫秒数
        long timeMillis = now.getTime();
        long timeMillis1 = now1.getTime();

        int result = now.compareTo(now1);
        boolean before = now.before(now1);
        boolean after = now.after(now1);

        //时区
        TimeZone tz = TimeZone.getDefault();
        System.out.println(tz.getID());
        //系统属性
        System.out.println(System.getProperty("user.timezone"));

        TimeZone timeZone = TimeZone.getTimeZone("GMT+08:00");
        System.out.println(timeZone.getID());


    }
}
