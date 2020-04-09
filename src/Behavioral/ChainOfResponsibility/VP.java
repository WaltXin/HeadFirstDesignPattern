package Behavioral.ChainOfResponsibility;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.ADMINISTRATOR) {
            System.out.println("approve by vp");
        } else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
