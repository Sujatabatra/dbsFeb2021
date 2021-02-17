package com.sujata.generics;

public class InputGeneric<T> {
     private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "InputGeneric [value=" + value + "]";
	}
     
     
}
