import java.util.Scanner;

public class Tictactoe {
    public static void renderBoard(int[] board){ //draws the board to the screen
        for(int i = 0; i < 9; i++){ //goes through all indexes of the board array and prints the relavent data at each position
            if(board[i] == 0){
                System.out.printf("[ O ]");
            }else if(board[i] == 10){
                System.out.printf("[ X ]");
            }else{
                System.out.printf("[   ]");
            }
            if((i + 1) % 3 == 0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) { //run game loop here
        int[] board = {1,2,3,4,5,6,7,8,9}; //initial board state
        boolean turn = ((int)(Math.random() * 2) == 0); //0 = true = O. 1 = false = X
        boolean game_over = false; //ends game loop
        System.out.printf("Welcome to Tic Tac Toe!\nThe board inputs are like this:\n\n[1][2][3]\n[4][5][6]\n[7][8][9]\n\n");
        Scanner pInput = new Scanner(System.in);

        while(!game_over){ //game loop
            renderBoard(board);
            System.out.printf("%c's turn!: ", ((turn) ? 'O':'X'));
            int player_pos = -1; //getting player input. wrong by default to trigger error handling
           
            while (!(player_pos > 0 && player_pos < 10)){ //error handling
                if(pInput.hasNextInt()){
                player_pos = pInput.nextInt();
                }else{
                    pInput.nextLine();
                }
            }

            if(board[player_pos - 1] == 0 || board[player_pos - 1] == 10){
                continue;
            }
            if(turn){
                board[player_pos - 1] = 0;
            }else{
                board[player_pos - 1] = 10;
            }
            turn = !turn;
            System.out.println();

            //win detection
            // 123
            // 456
            // 789
            //possible win states: 123, 456, 789, 147, 258, 369, 159, 357. subtract 1 for index
                                // 012, 345, 678, 036, 147, 258, 048, 246

            int[] winConditions = {board[0]+board[1]+board[2],
                board[3]+board[4]+board[5],
                board[6]+board[7]+board[8],
                board[0]+board[3]+board[6],
                board[1]+board[4]+board[7],
                board[2]+board[5]+board[8],
                board[0]+board[4]+board[8],
                board[2]+board[4]+board[6]};

            for(int i = 0; i < 8; i++){ //goes through all win conditions to check if one has been met. end the game if so
                if(winConditions[i] == 0){
                    renderBoard(board);
                    System.out.println("O Wins!");
                    game_over = true;
                    break;
                }else if(winConditions[i] == 30){
                    renderBoard(board);
                    System.out.println("X Wins!");
                    game_over = true;
                    break;
                }
            }

            //draw game detection
            if(!game_over){ //go through all indexes of the board to see if they've been filled. draw game if no winner was determined already
            int draw_check = 0;
            for(int i = 0; i < 9; i++){
                if(board[i] != 0 && board[i] != 10){
                    draw_check++;
                }
            }
            if (draw_check == 0){
                renderBoard(board);
                System.out.println("Draw game...Tic Tac Toe sucks :(");
                game_over = true;
            }
            }

        }
    }
}