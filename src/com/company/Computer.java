package com.company;

/**
 * Created by falyanguzov on 14.11.2016.
 */
public class Computer extends Player {
    static String[] names ={"1","2","3","4"};

    public Computer( Intellect intellect) {
        super(intellect, "");
        String name = names[(int) (Math.random() * names.length)];
        this.name = name;
    }
}
