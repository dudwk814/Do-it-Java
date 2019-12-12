package chapter15.stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {
	String name;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class ExternalizableTest {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.name = "�۸���";
		
		try (FileOutputStream fos = new FileOutputStream("external.out");
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(myDog);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("external.out");
			 ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Dog dog = (Dog) ois.readObject();
			System.out.println(dog);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
