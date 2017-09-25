package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
    
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
    
    public void viewModel() {
        
        /* Print the board to the console (see examples) */

        System.out.print("\n  ");

        for(int i = 0; i < model.getWidth(); i++) {
                System.out.print(i);
        }
        System.out.print("\n\n");

        for(int i = 0; i < model.getWidth(); i++) {
                System.out.print(i);
                System.out.print(" ");
                for(int j = 0; j < model.getWidth(); j++) {
                        System.out.print(model.getMark(i,j));
                }
                System.out.print("\n");
        }
        System.out.print("\n\n\n");
    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if (model.isXTurn()) {
           System.out.print("Player 1 (X) Move:\n");
           System.out.print("Enter the row and column numbers, separated by a space: ");
        }
        else {
           System.out.print("Player 2 (O) Move:\n");
           System.out.print("Enter the row and column numbers, separated by a space: ");
        }

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */

        System.out.print("Invalid entry.  Enter 0, 1, or 2 for rows/column.");


    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
    
}