package ex_12_generators;

import java.util.Random;

public abstract class Generator {

    protected Random rand;

    public Generator() {
        rand = new Random();
    }

    abstract String generate();
}
