package ru.job4j.api;

public class Test {
    public class CalcNotStatic {
        private int a = 10;

        public CalcNotStatic(int a) {
            this.a = a;
        }
    }

    public static void main(String[] args) {
        method(100);
        Test test = new Test();
        System.out.println();
    }

    public static void method(int a) {
        System.out.println(a);
    }

    public void methodNest() {
        CalcNotStatic calcNotStatic = new CalcNotStatic(333);
        System.out.println();
    }
}
