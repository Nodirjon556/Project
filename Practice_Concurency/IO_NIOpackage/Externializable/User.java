package IO_NIOpackage.Externializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {
    private String fullName;
    private int age;
    private int phoneNumber;

    public User(String fullName, int age, int phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.fullName.substring(0,2));
        out.writeInt(this.age);
        out.writeInt(this.phoneNumber);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.fullName = (String) in.readObject();
        this.age =  in.readInt();
        this.phoneNumber =  in.readInt();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
