package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDrive {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Jack"));
        users.add(new User(2, "Rose"));
        users.add(new User(3, "John"));
        users.add(new User(4, "Michael"));
        users.add(new User(5, "Margeret"));

        users.stream()
                .forEach(user -> {
                    System.out.println("Stream API");
                    //System.out.println(user.toString());
                    user.talk(); //toString method and talk method do same job!
                });

        users.stream().forEach(User::talk); //Above code snippet and this code snippet do same job! We called our method to show reference in here!

        System.out.println("-----------------------------------------------------------");

        long count = users.stream()
                .filter(user -> user.id > 3)
                .count();
        System.out.println("Count=" + count);

        System.out.println("-----------------------------------------------------------");

        List<User> filteredList = users.stream()
                .filter(user -> user.id > 3)
                .collect(Collectors.toList());
        filteredList.stream().forEach(User::talk);

        System.out.println("-----------------------------------------------------------");

        List<User> mappedUser = users.stream().map(user -> new User(user.id + 100, user.name))
                .collect(Collectors.toList());
        mappedUser.stream().forEach(user -> System.out.println(user.toString())); //We have been used toString to show id and name!
    }
}
