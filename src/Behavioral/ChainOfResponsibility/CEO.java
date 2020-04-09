package Behavioral.ChainOfResponsibility;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("approved by ceo");
    }
}
