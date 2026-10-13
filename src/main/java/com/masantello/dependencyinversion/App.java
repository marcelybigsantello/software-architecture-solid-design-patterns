package com.masantello.dependencyinversion;

public class App {

    public static void main(String[] args) {
        DatabaseController controller = new DatabaseController(new MySqlDatabase());

        controller.connect();
        controller.disconnect();
    }
}
