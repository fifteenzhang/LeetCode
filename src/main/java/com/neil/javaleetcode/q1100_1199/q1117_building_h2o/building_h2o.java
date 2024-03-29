package com.neil.javaleetcode.q1100_1199.q1117_building_h2o;

import java.util.concurrent.Semaphore;

class building_h2o {

    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(0);
    public building_h2o() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        h.acquire();
        releaseHydrogen.run();
        o.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        o.acquire(2);
        releaseOxygen.run();
        h.release(2);
    }
}
