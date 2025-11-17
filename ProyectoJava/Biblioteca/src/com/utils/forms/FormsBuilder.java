package com.utils.forms;

public class FormsBuilder {
    public static void printTitle(String title) {
        System.out.println(title);
        title.length();
        for (int i = 0; i < title.length(); i++) {
            System.out.print("=");
        }
    }
    public static void printValue(String label, String value) {
        System.out.println(label + ": " + value);
    }
    public static void divider(char c) {
        for (int i = 0; i < 30; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
