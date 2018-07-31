package main.day1;

/**
 * Created by Administrator on 2018/7/31.
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }

}
