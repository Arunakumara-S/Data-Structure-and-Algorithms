package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {
	public static void main(String[] args) {
		//Create an Object to serialize
		MyClass object = new MyClass("Task Completed", 40);
		
		//Serialize the object
		try {
			FileOutputStream fileOut = new FileOutputStream("object.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(object);
			out.close();
			fileOut.close();
			System.out.println("Object serialized and saved as object.ser");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//Deserialize the object
		MyClass deserializaedObject = null;
		try {
			FileInputStream fileIn = new FileInputStream("object.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			deserializaedObject = (MyClass) in.readObject();
			in.close();
			fileIn.close();
			}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(deserializaedObject != null) {
			System.out.println("Deserialized object: "+deserializaedObject.getMessage());
			System.out.println("Deserialized object: "+deserializaedObject.getNumber());
		}
		
				
	}

}

