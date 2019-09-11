package cn.yq.test;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author yq
 * @version 1.0
 * @date 2019/9/10 0:04
 */
public class Test1 {
    /***
     * lambda表达式
     *
     *
     * Function<Integer,String>  function接口   通过Integer转型为string</Integer,String>
     *
     * Supplier 接口，get()提供一个返回值的接口
     *
     *
     * Predicate 接口，语言是否正确，语言一个接口
     *
     * Comsumer接口  消费一个接口  消费一个接口就，通过apply进行消费
     *
     * @param fun
     * @param string
     * @return
     */
    public static Integer test1(Function<String,Integer> fun,String string){

        return fun.apply(string);
    }
    public static void main(String[] args) {


        final List<Object> objects = Collections.emptyList();

        objects.add("new Strign")
                ;


        objects.stream().forEach(x-> System.out.println(x));




    }
    public static boolean testPredict(Predicate<Integer> integerPredicate,Integer sum){
        return integerPredicate.test(sum);
    }

    public void kkm(myfunInter inter) {
        final String s = inter.toString();

        System.out.println(s);

    }

    public static Integer getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
