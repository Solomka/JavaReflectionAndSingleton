package task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect {

	public static void main(String[] args) throws Exception {

		// Class c = Test.class;
		Class c = Class.forName("task1.Test");

		// package name

		System.out.println("PackageName: " + c.getPackage() + "\n");

		// class name

		System.out.println("ClassName: " + c.getSimpleName() + "\n");

		// superclass name

		System.out.println("SuperclassName: "
				+ c.getSuperclass().getSimpleName() + "\n");

		// class fields

		Field[] publicFields = c.getDeclaredFields();
		for (Field field : publicFields) {
			Class fieldType = field.getType();
			System.out.println("Name: " + field.getName());
			System.out.println("Type: " + fieldType.getName() + "\n");
		}

		// class constructor

		Constructor[] constructors = c.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("Constructor: " + constructor.getName() + " ");
			Class[] paramTypes = constructor.getParameterTypes();
			for (Class paramType : paramTypes) {
				System.out.println("Parameter type: " + paramType.getName()
						+ " ");
			}
			System.out.println();
		}

		// class methods

		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Name: " + method.getName());
			System.out.println("Return type: "
					+ method.getReturnType().getName());

			Class[] paramTypes = method.getParameterTypes();
			System.out.print("Parametr types: ");
			for (Class paramType : paramTypes) {
				System.out.print(" " + paramType.getName());
			}
			System.out.println("\n");
		}

		// determination of the interfaces which are implemented by the class
		// Test

		Class[] interfaces = c.getInterfaces();
		for (Class cInterface : interfaces) {
			System.out.println(cInterface.getName());
		}

	}
}
