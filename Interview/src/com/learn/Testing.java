package com.learn;

class AA {
	public int num;

	public AA(int num) {
		this.num = num;
	}
}

class BB extends AA {

	public BB(int num) {
		super(num);
	}
}

class CC extends BB {

	public CC(int num) {
		// System.out.println("");
		super(num);
	}

	public void tt() {
		System.out.println(super.num);
	}
}

public class Testing {

	public static void main(String[] args) {
		CC c = new CC(55);
		c.tt();
	}
	
}
