package com.codecool.cmd;

import com.codecool.api.Wardrobe;

class CmdProgram {
    private AllPrinting display = new AllPrinting();
    //private Wardrobe wardrobe;
    
    void start() {
        String[] commands = {"Add new wardrobe", "Exit"};
    
        while (true) {
            display.showMenu("Main Menu (Enter one of the numbers)", commands);
            int command = Integer.parseInt(display.getInput());
        
            switch (command) {
                case 1:
                    int size = Integer.parseInt(display.getInput());
                    handleWardrobe(new Wardrobe(size));
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Wrong input! Choose a valid number!");
            }
        }
    }
    
    private void handleWardrobe(Wardrobe wardrobe) {
    
    }
}
