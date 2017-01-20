package task3;

import java.io.Serializable;

/*
 * Вариант пятый


 */
public final class Configuration implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private Configuration() {
	}
//nested inner class
	private static class ConfigurationHelper {
		private static final Configuration instance = new Configuration();
	}

	public static Configuration getInstance() {
		return ConfigurationHelper.instance;
	}

	//How do you prevent for creating another instance of Singleton during serialization
	/*
	 * You can prevent this by using readResolve() method, 
	 * since during serialization readObject() is used to create instance and it return new instance every time 
	 * but by using readResolve you can replace it with original Singleton instance.

	 */
	protected Object readResolve() {
		return getInstance();
	}

}
