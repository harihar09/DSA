package Java7.Serialization;

import java.io.*;

public class Serialization1 implements Serializable {
   transient  final int a=100;
    int b;
   public Serialization1(int b){
      //  this.a=a;
        this.b=b;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

       Serialization1 s1 = new Serialization1(20);
       //serialization using OOS and FOS

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("R:\\Java\\test.ser"));
        objectOutputStream.writeObject(s1);

        //deserialization using OIS and FIS

        FileInputStream fileInputStream = new FileInputStream("R:\\Java\\test.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Serialization1 object =(Serialization1) objectInputStream.readObject();
        System.out.println("After deserialization : "+object.a+" "+object.b);
    }
}
