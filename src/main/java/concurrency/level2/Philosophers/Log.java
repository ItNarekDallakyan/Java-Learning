package concurrency.level2.Philosophers;

class Log {

    static void msg(String msg) {
        System.out.println(msg);
    }

    static void Delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        }
    }
}
