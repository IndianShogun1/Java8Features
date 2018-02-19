interface DemoInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
public class Ques5 {
    public static void main(String[] args) {
        DemoInterface demoInterface = new DemoInterface() {};
        demoInterface.defaultMethod();
        DemoInterface.staticMethod();
    }
}
