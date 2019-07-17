public class Main {
    public static void main(String[] args) {
        Size small = Size.SMALL;
        //枚举变量的toString()方法返回其字面值
        System.out.println(small.toString());
        System.out.println(small.name());

        //枚举类型可以使用==和equals进行比较，结果是一样的
        System.out.println(small == Size.SMALL);
        System.out.println(small.equals(Size.SMALL));

        //枚举是有顺序的，可以比较大小。枚举类型都有一个方法 int ordinal(),
        //表示枚举在声明时的顺序，从0开始
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.LARGE.ordinal());

        //枚举比较大小其实就是比较ordinal的大小
        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));

        //枚举类型都有一个静态的valueOf(String)方法，返回字符串对应的枚举值
        Size size1 = Size.valueOf("SMALL");
//        Size size2 = Size.valueOf("SMALL1");//Exception: No enum constant Size.SMALL1

        //枚举类型都有一个静态的values()方法,返回包括所有枚举值的数组，顺序与声明时一样
        Size[] arr = Size.values();
        for (Size size:arr) {
            System.out.println(size);
        }    

        //每个枚举值经常会有一个关联的标识符（id）,通常用int整数表示，使用整数可以节约存储空间，减少网络传输
        //使用自带的ordinal并不合适，因为ordinal会随着定义位置的变化而变化，
        // 我们希望id值和枚举值保持不变，尤其是枚举值的id已经保存在很多的地方
        SizeWithId large = SizeWithId.LARGE;
        System.out.println(large.getId());
        System.out.println(large.ordinal());
    }
}
