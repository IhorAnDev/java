package lambda2;

public class Test {
    public static void main(String[] args) {
        TestInferenceType tit = new TestInferenceType();
    }
}

class TestInferenceType {
}

interface I {
    void abc();
    default void def(){};
}