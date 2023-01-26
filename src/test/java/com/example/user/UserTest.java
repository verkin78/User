package com.example.user;

import com.example.user.Models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void addUser() {
        User user = new User("Nika","niki5@gmail.com");
        Assertions.assertNotNull(user);
    }

    @Test
    public void addUserNull() {
        User user1 = new User();
        Assertions.assertNotNull(user1);
    }

    @Test
    public void checkUser() {
        User user2 = new User("Kirill","k18ll@mail.ru");
        Assertions.assertNotNull(user2);

        Assertions.assertTrue(user2.getEmail().contains("@") &&
                user2.getEmail().contains("."));
    }

    @Test
    public void checkEqualsFields() {
        User user3 = new User("Katrina","kate875421@mail.ru");
        Assertions.assertNotNull(user3);

        Assertions.assertNotEquals(user3.getEmail(), user3.getLogin());
    }
}
