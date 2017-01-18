package task1;

// Вивести назву класу

// Вивести назву батьківського класу

// Вивести поля класу

// Вивести констуктор класу

// Вивести методи класу з описом

import java.io.Serializable;

public abstract class Test implements Serializable, Cloneable {

	public int field;
	private int num;

	public Test(Object field) {
	}

	@Deprecated
	protected static void method(String[] params) {
	}
}
