package ratelimiter;

public class PrintTask implements Runnable {

    Integer id;

    public PrintTask(Integer id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id);
    }

}
