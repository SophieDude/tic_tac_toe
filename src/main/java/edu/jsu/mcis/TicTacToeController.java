package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeController {

    private TicTacToeModel model;
    private TicTacToeView view;
    private Scanner keyboard;
    
    /* CONSTRUCTOR */

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        
        /* Initialize model and view */

        this.model = model;
        this.view = view;
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);

    }

    public void controlModel() {
        int row;
        int col;
        boolean vaidAnswer;

        /* Prompt player for next move using view's showNextMovePrompt() */

         /* print to screen the prompts*/

        view.showNextMovePrompt();
        
        /* Receive and validate input, which should be read at the keyboard as
           two integers, the row and the column (for example, "1 1" for the
           center square of a 3 x 3 grid).  Make mark if input is valid, or show
           error message using view's showInputError() if input is invalid. */ 

  //      while (!vaidAnswer) {
            row = keyboard.nextInt();
            col = keyboard.nextInt();
            
/*             if (row < 2){
                view.showInputError();
                vaidAnswer = false;
            }
            else if (row > 0) {
                view.showInputError();
                vaidAnswer = false;
            }
            if (col < 2){
                view.showInputError();
                vaidAnswer = false;
            }
            else if (col > 0) {
                view.showInputError();
                vaidAnswer = false;
            }
            vaidAnswer = true;
        } */
        if (true){
           model.makeMark(row, col);
        }
    }

}