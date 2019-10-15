package test;

import another.TestChild2;

public class Main {

    public static void main(String[] args) {
        TestParent tst = new TestParent();
        tst.test("Same package");

        TestChild1 tst1 = new TestChild1();
        tst1.call();

        TestChild2 tst2 = new TestChild2();
        tst2.call();
    }
}
