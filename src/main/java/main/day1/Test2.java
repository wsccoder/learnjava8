package main.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangsccoder
 * Lambda  表达式
 * on 2018/7/31.
 */
public class Test2 {
    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    public void  test1(){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(names);
    }



    public static void main(String args[]){
        Test2 test2 = new Test2();
        test2.test1();
    }
}
