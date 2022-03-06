package com.myForLoop;

public class Students {
	
	private String name;
	private int standard;
	private String addrs;
	
	public Students(String name, int standard, String addrs) {
		this.name = name;
		this.standard = standard;
		this.addrs = addrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", standard=" + standard + ", addrs=" + addrs + "]";
	}
	
}
