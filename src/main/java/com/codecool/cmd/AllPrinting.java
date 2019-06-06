package com.codecool.cmd;

import java.util.Scanner;

class AllPrinting {
    private Scanner sc = new Scanner(System.in);
    
    void showMenu(String title, String[] commands) {
        int count = 1;
        System.out.println(title + "\n");
        for (String command : commands) {
            System.out.println("\t" + count + ") " + command);
            count++;
        }
    }
    String getInput() {
        return sc.nextLine();
    }
    
}
