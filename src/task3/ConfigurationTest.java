package task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ConfigurationTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		// create new serialized object
		Configuration test1 = Configuration.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
				"config.txt"));
		out.writeObject(test1);
		out.close();
		// create the same object- check that there is just one object of this
		// type
		Configuration test1_2 = Configuration.getInstance();

		// deserialize from file to object - the same object
		ObjectInput in = new ObjectInputStream(
				new FileInputStream("config.txt"));
		Configuration test2 = (Configuration) in.readObject();
		in.close();

		System.out.println("Test1 hashCode=" + test1.hashCode());
		System.out.println("Test1_2 hashCode=" + test1_2.hashCode());
		System.out.println("Test2 hashCode=" + test2.hashCode());

	}

}
