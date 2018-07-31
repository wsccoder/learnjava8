package main.day1;

/**
 * Created by wsccoder
 * on 2018/7/31.
 */
public class Test1 {

    public static void main(String args[]){
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
    }

}
