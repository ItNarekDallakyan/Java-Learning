package concurrency.level2.Philosophers;


class Philosopher extends Thread {
    private Chopstick leftChopistick;
    private Chopstick rightChopistick;

    private String name;
    private int _state;
    private int rounds;

    Philosopher(String name, Chopstick _left, Chopstick _right, int rounds) {
        this._state = 1;
        this.name = name;
        leftChopistick = _left;
        rightChopistick = _right;
        this.rounds = rounds;
    }

    private void eat() {
        if (!leftChopistick.used) {
            if (!rightChopistick.used) {
                leftChopistick.take();
                rightChopistick.take();

                Log.msg(name + " : Eat");

                Log.Delay(1000);

                rightChopistick.release();
                leftChopistick.release();
            }
        }
        think();
    }

    private void think() {
        this._state = 1;
        Log.msg(name + " : Think");
        Log.Delay(1000);

    }

    public void run() {
        for (int i = 0; i <= rounds; i++) {
            eat();
        }
    }
}
