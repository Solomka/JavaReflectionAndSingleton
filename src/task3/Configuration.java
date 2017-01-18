package task3;

import java.io.Serializable;

public class Configuration implements Serializable {

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

	protected Object readResolve() {
		return getInstance();
	}

}
