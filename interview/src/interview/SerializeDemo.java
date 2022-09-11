package interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) throws Exception{
		A a1=new A();
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		
		//de serialization
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
	    A a2= (A) ois.readObject();
	    System.out.println(a2.i+"  "+a2.j);
	}

}
