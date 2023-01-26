package com.example.user;

import java.util.Objects;
import java.util.stream.Stream;

public class User {
    private String login;
    private String email;

    public User() {
    }
    public User(String login, String email) {
        setLogin(login);
        setEmail(email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        Stream.of(login)
                .filter(Objects::nonNull);
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Stream.of(email)
                .filter(Objects::nonNull)
                .filter(e -> e.contains("@"))
                .filter(e -> e.contains("."));
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
