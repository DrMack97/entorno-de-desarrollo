package com.utils.forms;

public class FormsBuilder {
    public static void printMsg(String msg, char c) {
        System.out.println(msg);
        msg.length();
        for (int i = 0; i < msg.length(); i++) {
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
