package com.spring.collections;

import java.util.Set;

public class AdressSet {
	private Set<String> address;
	
	AdressSet(){
		
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AdressSet [address=" + address + "]";
	}
	

}
