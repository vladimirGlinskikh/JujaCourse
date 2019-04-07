package quizs.quiz31.monitors;

public class ApplicationOne {
    public static void main(String[] args) throws Exception {
//        new Object().wait();
        // будет выброшено IllegalMonitorStateException

        //new Object().notify();
        //будет выброшено IllegalMonitorStateException

        //new Object().notifyAll();
        //будет выброшено IllegalMonitorStateException

//        synchronized (new Object()) {
//            new Object().wait();
//        }
//        будет выброшено IllegalMonitorStateException

//        synchronized (new Object()){
//            new Object().wait();
//        }
//        будет выброшено IllegalMonitorStateException


//        synchronized (new Object()){
//            new Object().notify();
//        }
//        будет выброшено IllegalMonitorStateException

//        synchronized (new Object()){
//            new Object().notifyAll();
//        }
//        будет выброшено IllegalMonitorStateException

//        Object ref = new Object();
//        synchronized (ref) {
//            ref.wait();
//        }
//        повиснет при запуске

//        Object ref = new Object();
//        synchronized (ref){
//            ref.notify();
//        }
//        ничего не произойдет, выполнится и завершится

//        Object ref = new Object();
//        synchronized (ref) {
//            ref.notifyAll();
//        }
//        ничего не произойдет, выполнится и завершится
    }
}
