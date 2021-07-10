package ru.job4j.api;

public class Test {
    public class CalcNotStatic {
        private int a = 10;

        public CalcNotStatic(int a) {
            this.a = a;
        }
    }

    public static void main(String[] args) {
        //Calc calc = new Calc();

        //System.out.println(Test.Calc.class);
        //System.out.println();
        //Test.CalcNotStatic calcNotStatic = new CalcNotStatic();
        method(100);
        Test test = new Test();
        //System.out.println(test.methodNest("asdfasdf"));
        //CalcNotStatic calcNotStatic = new CalcNotStatic();
        System.out.println();
    }

    public static void method(int a) {
        System.out.println(a);
    }

    public void methodNest() {
        CalcNotStatic calcNotStatic = new CalcNotStatic(333);
        //Test test = new Test();
        System.out.println();
    }
}
