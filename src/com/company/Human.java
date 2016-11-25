package com.company;

/**
 * Created by falyanguzov on 14.11.2016.
 */
public class Human extends Player {
    public Human(String name) {
        super(new ConsoleIntellect(), name );
    }
}
