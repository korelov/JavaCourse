package org.homework.four.ex4;

public class User {
    private String name;
    private String password;
    private Message[] messages = new Message[100];

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Message[] getMessages() {
        return messages;
    }
}
