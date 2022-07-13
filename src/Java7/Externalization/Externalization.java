package Java7.Externalization;

import java.io.*;

public class Externalization implements Externalizable {

    private String  name;
    private int age;
    private String  city;
    public Externalization(){
        System.out.println("default constructor");
    }
    public Externalization(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
           out.writeObject(name);
           out.writeObject(city);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
           name =(String)  in.readObject();
           city = (String) in.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Externalization obj1 = new Externalization("jon",40,"delhi");
        System.out.println("Before Serialization "+obj1.name+" "+obj1.age+" "+obj1.city);

        //Serialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("R:\\Java\\test3.ser"));
        objectOutputStream.writeObject(obj1);

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("R:\\Java\\test3.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Externalization obj2 =(Externalization) objectInputStream.readObject();
        System.out.println("Before Serialization "+obj2.name+" "+obj2.age+" "+obj2.city);

    }
}
