package vn.edu.git;

import vn.edu.sample.Test;

public class Main {
    private void function1(int i) {
        for (i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }

    private void function2() {
        System.out.print("FUNCTION2");
    }

    public static void main(String[] args) {
        System.out.print("Hello World");
        Test test = new Test();
    }
}
