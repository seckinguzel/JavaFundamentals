package serialization;

import java.io.*;

public class TestUser {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.setId(1);
        user.setName("Seckin");

        String filePath = "/Users/seckinguzel/IdeaProjects/JavaTeamEducationGettingDeeperPart/src/_8Serialization/user.txt"; //This package file path has to declare here!

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);

        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User deserializedUser = null;

        try {
            deserializedUser = (User) objectInputStream.readObject();
            System.out.println(deserializedUser.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
