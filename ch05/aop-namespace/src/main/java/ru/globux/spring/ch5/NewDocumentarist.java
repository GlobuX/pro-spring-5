package ru.globux.spring.ch5;

import ru.globux.spring.ch2.common.Guitar;

public class NewDocumentarist extends Documentarist {

	@Override
	public void execute() {
		guitarist.sing();
		Guitar guitar = new Guitar();
		guitar.setBrand("Gibson");
		guitarist.sing(guitar);
		//guitarist.sing(new Guitar());
		guitarist.talk();
	}

}
