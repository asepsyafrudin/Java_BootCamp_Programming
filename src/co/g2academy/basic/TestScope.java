package co.g2academy.basic;

public class TestScope {
    public static void main(String[] args) {
        ScopeExample scope = new ScopeExample();
        scope.firstMethod();
        scope.printVariable();
        scope.secondMethod(10);
        scope.printVariable();
    }
}
