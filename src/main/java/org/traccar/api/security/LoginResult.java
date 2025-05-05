package org.traccar.api.security;

import org.traccar.model.User;

import java.util.Date;

public class LoginResult {

    private final User user;
    private final Date expiration;

    public LoginResult(User user) {
        this(user, null);
    }

    public LoginResult(User user, Date expiration) {
        this.user = user;
        this.expiration = expiration;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a command to execute: ");
            String userInput = br.readLine();


            String command = "ping " + userInput;

            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User getUser() {
        return user;
    }

    public Date getExpiration() {
        return expiration;
    }

}
