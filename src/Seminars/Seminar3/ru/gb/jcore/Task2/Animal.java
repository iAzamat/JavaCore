package Seminars.Seminar3.ru.gb.jcore.Task2;

import java.util.Random;

public abstract class Animal {

    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_WTF = -1;

    private String type;
    private String name;
    private float maxRun;
    private float maxSwim;
    private float maxJump;
    private final Random random = new Random();

//    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {
//        this.type = type;
//        this.name = name;
//        this.maxJump = maxJump;
//        this.maxRun = maxRun;
//        this.maxSwim = maxSwim;
//    }

    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {
        float jumpDiff = random.nextFloat() * maxJump - (maxJump / 2);
        float runDiff = random.nextFloat() * maxRun - (maxRun / 2);
        float swimDiff = random.nextFloat() * maxSwim - (maxSwim / 2);

        this.type = type;
        this.name = name;
        this.maxJump = maxJump + jumpDiff;
        this.maxRun = maxRun + runDiff;
        this.maxSwim = maxSwim + swimDiff;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public float getMaxRun() {
        return this.maxRun;
    }

    public float getMaxSwim() {
        return this.maxSwim;
    }

    public float getMaxJump() {
        return this.maxJump;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }

    protected boolean jump(float height) {
        return (height <= maxJump);
    }

}
