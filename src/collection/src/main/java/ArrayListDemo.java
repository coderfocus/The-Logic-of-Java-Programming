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








}
