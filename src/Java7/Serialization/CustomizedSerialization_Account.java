package Java7.Serialization;

import java.io.*;

public class CustomizedSerialization_Account implements Serializable {

    private String name = "tom";
    private transient  String pwd = "tom";

    public CustomizedSerialization_Account() throws IOException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        String epwd = "123"+pwd;
        objectOutputStream.writeObject(epwd);
    }
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String epwd = (String) objectInputStream.readObject();
        pwd = epwd.substring(3);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("R:\\Java\\test2.ser"));
        CustomizedSerialization_Account c1 = new CustomizedSerialization_Account();
        System.out.println("before :"+c1.name+" "+c1.pwd);
        objectOutputStream.writeObject(c1);

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("R:\\Java\\test2.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CustomizedSerialization_Account c2 = (CustomizedSerialization_Account) objectInputStream.readObject();
        System.out.println("After :"+c2.name+" "+c2.pwd);
    }



}
