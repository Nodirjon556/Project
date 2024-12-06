package IO_NIOpackage.Externializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Okilov Nodirjon",19,81851122);

        serializable(user);

        externialized();
    }

    private static void externialized() {
        try(FileInputStream inputStream = new FileInputStream("io/nodir.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            User u = (User) objectInputStream.readObject();
            System.out.println(u);
            System.out.println("Externialized");
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void serializable(User user) {
        try(FileOutputStream outputStream = new FileOutputStream("io/nodir.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(user);
            System.out.println(user);
            System.out.println("Serialized");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
