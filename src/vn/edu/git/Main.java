package vn.edu.git;

import vn.edu.sample.Test;

public class Main {
    private String function2() {
        System.out.println("FUNC-randomtext-" +
                "TION2");
        return "AAA";
    }

    private int functionConflict(String s) {
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        System.out.print("Hello World");
        Test test = new Test();
    }
}
