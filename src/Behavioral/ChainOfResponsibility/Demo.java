package Behavioral.ChainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request1 = new Request(RequestType.CONFLUENCE, 20);
        Request request2 = new Request(RequestType.ADMINISTRATOR, 20);
        Request request3 = new Request(RequestType.BOARD, 20);
        director.handleRequest(request1);
        director.handleRequest(request2);
        director.handleRequest(request3);
    }

}
