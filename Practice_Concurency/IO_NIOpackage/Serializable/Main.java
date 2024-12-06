package IO_NIOpackage.Serializable;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        User us = new User("Nodirjon Okilov", 19, 81851122);
        serializble(us);
      deSerizalizble();
    }

    private static void serializble(User user) {
        try (FileOutputStream outputStream = new FileOutputStream("io/xushnid.txt");
             ObjectOutputStream out = new ObjectOutputStream(outputStream)) {
            out.writeObject(user);
            System.out.println(user);

            System.out.println("srizaliezd");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void deSerizalizble() {
        try (FileInputStream input = new FileInputStream("io/xushnid.txt");
             ObjectInputStream inputStream = new ObjectInputStream(input)) {
            User o = (User)inputStream.readObject();
            System.out.println(o);
            System.out.println("DeSerialized");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
