/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Mark Earl
 */
public class BoardView {
    Board board = new Board();
    
    String display = "\t ";
    
    int rowCount = board.actualRowCount;
    int colCount = board.actualRowCount;
    
    
    public BoardView() {
    }

    public void displayBoard() {
        System.out.println(
           "\t    1   2   3   4   5   6   7   8\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t1 ||||| x ||||| x ||||| x ||||| x |\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t2 | x ||||| x ||||| x ||||| x |||||\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t3 ||||| x ||||| x ||||| x ||||| x |\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t4 |   |||||   |||||   |||||   |||||\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t5 |||||   |||||   |||||   |||||   |\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t6 | o ||||| o ||||| o ||||| o |||||\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t7 ||||| o ||||| o ||||| o ||||| o |\n"
         + "\t  |---|---|---|---|---|---|---|---|\n"
         + "\t8 | o ||||| o ||||| o ||||| o |||||\n"
         + "\t  |---|---|---|---|---|---|---|---|\n\n");
        for (int row = 1; row <= 8; row++)
            display += "   " + row;
        display += "\n";
        
        System.out.println(display);
      /*  for (int row = 0; row  < 18; row++) {
            for (int col = 0; col < 8; col++) {
                int rowPlace = 0;
             }
         }*/
    }

}
