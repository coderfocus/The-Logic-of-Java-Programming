import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    /** 
    * @Description: 在迭代过程中，容器不能发生结构性变化 
    * @param: []
    * @return: void 
    * @Author: songwenjie
    * @Date: 2019/7/11 
    */ 
    public static void removeItemWhenIterate(){
        List<String> list = new ArrayList<>(Arrays.asList("coder","focus","good"));
        //在迭代过程中，容器不能发生结构性变化
//        list.forEach(l->{
//            list.remove(l);
//        });

        //可以使用迭代器的remove方法在迭代中删除容器元素
        Iterator<String> iterator =  list.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }


    /** 
    * @Description: Arrays.asList内部使用的就是传入的参数数组，没有复制，也不会动态改变大小 
    * @param: []
    * @return: void 
    * @Author: songwenjie
    * @Date: 2019/7/11 
    */ 
    public static void asList(){
        //Arrays.asList内部使用的就是传入的参数数组，没有复制，也不会动态改变大小
        //不支持做add remove操作
        //可以使用List<String> list = new ArrayList<>(arr);恢复完整的方法
        String[] arr = {"coder","focus","good"};
        List<String> list1 = Arrays.asList(arr);
        System.out.println(list1.toString());
        arr[2] = null;
        System.out.println(list1.toString());
        list1.set(2,"good");
        System.out.println(list1.toString());
        //list1.add("good"); //UnsupportedOperationException
    }






}
