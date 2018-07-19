package com.example;

import lombok.Getter;

class App {
  @Getter
  String name = "foo";

  static App app = new App();

  public static void main(String[] args) {
    System.out.println(app.doubleName());
  }

  public String doubleName() {
    return name + " " + name;
  }
}
