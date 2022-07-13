package Java7.Serialization;

import java.io.*;

public class ObjectGraph implements Serializable {

    Dog d1 = new Dog();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectGraph objectGraph = new ObjectGraph();
        int j = objectGraph.d1.c.r.j;
        System.out.println("Before Serialization : "+j);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("R:\\Java\\test1.ser"));
        objectOutputStream.writeObject(objectGraph);

        FileInputStream fileInputStream = new FileInputStream("R:\\Java\\test1.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       ObjectGraph object =(ObjectGraph) objectInputStream.readObject();
        System.out.println("After Serialization : "+object.d1.c.r.j);

    }
}
