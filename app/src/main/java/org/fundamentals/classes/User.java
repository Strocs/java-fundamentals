package org.fundamentals.classes;

public class User {
  // Default
  // Public
  // Private
  // Protected

  public String username;
  private String password;

  // constructor overflow
  public User(String username, String password) {
    // Executed when instance is created
    this.username = username;
    this.password = password;
  }

  public User(String username) {
    this.username = username;
    this.password = "";
  }

  public User() {
    this.username = "";
    this.password = "";
  }

  public void hello() {
    System.out.println("Hola, my username is: " + this.username);
  }

  // Getter
  public String getPassword() {
    return this.password;
  }

  // Setter
  public void setPassword(String password) {
    this.password = password;
  }

  public void setRol() {
    Admin admin = new Admin();
    admin.work();
  }

  public class Admin {
    public void work() {
      System.out.println("Admin " + username + " is working");
    }

  }
}
