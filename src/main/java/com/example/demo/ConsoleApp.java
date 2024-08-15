package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.UUID;

public class ConsoleApp {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner getUserInput = new Scanner(System.in);

        //! Formatting
        System.out.println("____________________________________________________________ \n");
        System.out.println("|                                                         |");
        System.out.println("|  Welcome to the Spring Boot REST API Demo Application!  |");
        System.out.println("|                                                         |");
        System.out.println("____________________________________________________________ \n");

        //! Creating a new user
        System.out.println("Get started by creating a new user. \n");
        System.out.print("Enter the name of the user: ");
        String registerFormInputName = getUserInput.nextLine();
        System.out.print("Enter the email of the user: ");
        String registerFormInputEmail = getUserInput.nextLine();
        System.out.print("Enter the password of the user: ");
        String registerFormInputPassword = getUserInput.nextLine();
        String registerUserUUID = UUID.randomUUID().toString();

        if (registerFormInputName.equals("") || registerFormInputEmail.equals("") || registerFormInputPassword.equals("")) {
            System.out.println("Please enter a valid name, email and password");
        } else if (registerFormInputName.length() < 3 || registerFormInputEmail.length() < 3 || registerFormInputPassword.length() < 3) {
            System.out.println("Please enter a valid name, email and password");
        } else {
            //! Initialize the request

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(String.format("[{\"name\":\"%s\", \"email\":\"%s\", \"password\":\"%s\", \"userId\":\"%s\"}]", registerFormInputName, registerFormInputEmail, registerFormInputPassword, registerUserUUID)))
                    .uri(URI.create("http://localhost:8080/api/createUser"))
                    .header("Content-Type", "application/json")
                    .build();

            //! Send the request to the api
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\nUser created successfully!, status code: " + response.statusCode() + "\n");
            System.out.println(response.body());


        }

        getUserInput.close();

    }
}
