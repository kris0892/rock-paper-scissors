import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    
    // Create a scanner for user input 
    Scanner in = new Scanner(System.in); 

    // create a loop to keep asking the user to enter a move
    while(true) {

      // Ask the user to enter their move 
    System.out.println("Please enter your move. Type in rock, paper, or scissors. If you want to exit the game, type in quit. ");
    String myMove = in.nextLine();

    // check if the user entered quit 
    if(myMove.equals("quit")){
      break;
    }


    // verify that my move is valid 
    if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")){
      System.out.println("you move isn't valid!"); 
    }else{

      // randonly generate the opponents move
    int rand = (int)(Math.random() * 3);
    String opponentMove = ""; 
    if(rand == 0){
      opponentMove = "rock"; 
    }else if(rand == 1){
      opponentMove = "paper";
    }else{
      opponentMove = "scissors";
    }
    System.out.println("opponent move: " + opponentMove); 

    // calcuate if the user won, lost or tied
    if(myMove.equals(opponentMove)){
      System.out.println("you tied!");
    }else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
      System.out.println("You won!"); 
    }else{
      System.out.println("you lost!");
    }

    }

    }

    System.out.println("Thanks for playing! :)"); 
    

  }
}