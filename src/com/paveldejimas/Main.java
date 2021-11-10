package com.paveldejimas;

import com.paveldejimas.isvestine.StatybininkasImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StatybininkasImpl statybininkas = new StatybininkasImpl(5, "mechanioras", "aukstasis", 1500.55 );
        System.out.println(statybininkas);
    }
}
