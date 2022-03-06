package com.treeset;

public class MyInteger implements Comparable<MyInteger> {

	private Integer intValue;

	public MyInteger(Integer intValue) {
		this.intValue = intValue;
	}

	public MyInteger() {
	}

	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyInteger) {
			System.out.println(this.intValue == ((MyInteger) obj).intValue);
			System.out.println(this.intValue.equals(((MyInteger) obj).intValue));
			return this.intValue.equals(((MyInteger) obj).intValue);
		}
		return false;
	}

	@Override
	public String toString() {
		return this.intValue.toString();
	}
	
	@Override
	public int compareTo(MyInteger obj) {
		if (intValue.equals(obj.intValue))
			return 0;
		else if (intValue > obj.intValue)
			return 1;
		else
			return -1;
	}
}
