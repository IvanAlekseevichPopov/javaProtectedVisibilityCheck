package another;

import test.TestParent;

public class TestChild2 extends TestParent {
    public void call() {
        this.test("Child from another package");
    }
}
