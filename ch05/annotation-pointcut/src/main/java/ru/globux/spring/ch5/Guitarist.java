package ru.globux.spring.ch5;

import ru.globux.spring.ch2.common.Guitar;
import ru.globux.spring.ch2.common.Singer;

public class Guitarist implements Singer {

	@Override public void sing() {
		System.out.println("Dream of ways to throw it all away");
	}

	@AdviceRequired
	public void sing(Guitar guitar) {
		System.out.println("play: " + guitar.play());
	}

	public void rest(){
		System.out.println("zzz");
	}

}
