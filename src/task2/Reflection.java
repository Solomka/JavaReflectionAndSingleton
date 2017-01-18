package task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Class cl = Test2.class;
		// Class cl = Class.forName("task2.Test2");

		Constructor[] constructors = cl.getDeclaredConstructors();

		for (Constructor constr : constructors) {
			constr.setAccessible(true);

			constr.newInstance();

			System.out.println();
			// constr.setAccessible(false);
		}

	}

}
