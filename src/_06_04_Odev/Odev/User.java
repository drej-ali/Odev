package _06_04_Odev.Odev;

import java.util.Scanner;

public class User {
    int id;
    String  username;
    String  password;
    boolean active;
    boolean signedIn;
    Role role;
    private static int countId=0;

    public User(String username, String password, Role role) {
        id=++countId;
        setUsername(username);
        setPassword(password);
        setRole(role);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Scanner input=new Scanner(System.in);
        System.out.print("şifrenizi giriniz:");
        String girilenSifre= input.nextLine();
        if (girilenSifre.length()>6)
            this.password=girilenSifre;
        else do {System.out.print("6 karakterden uzun yeni şifre giriniz:");
                 password=input.nextLine();
                 if (password.length()<6)
                     this.password=password;
        }while (password.length()<6);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                ", role=" + role +
                '}';
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
