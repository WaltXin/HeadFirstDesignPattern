package Behavioral.ChainOfResponsibility;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFLUENCE) {
            System.out.println("approve by director");
        } else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
