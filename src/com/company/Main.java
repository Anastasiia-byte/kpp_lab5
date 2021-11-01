package com.company;


public class Main {
    public static void main(String[] args) {
        String fileName = "input";
        String input = FileReader.getInput(fileName);

        System.out.println("Text before replacement:\n" + input);
        try {
            input = TextManager.replace(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nText after replacement:\n" + input);
    }
}
