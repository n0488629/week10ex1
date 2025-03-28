import java.util.Scanner;  // Import the Scanner class

class Main {
public static void castVote(int[] Can1, int[] Can2, int[] Can3){ // create a method to add votes to arrays
    Scanner myObj1 = new Scanner(System.in); // new scanner object for method
  System.out.println("Which candidate do you want to vote for? 1: Candidate 1 2: Candidate 2 3: Candidate 3.");
  int userchoice = myObj1.nextInt(); // user input for switch

  switch(userchoice) { // switch to decide user vote
    case 1:
    Can1[0] = Can1[0] + 1; // increase the value in the array to track the votes
    System.out.println("Vote successfully cast.");
    break;
    case 2:
    Can2[0] = Can2[0] + 1; // increase the value in the array to track the votes
    System.out.println("Vote successfully cast.");

    break;
    case 3:
    Can3[0] = Can3[0] + 1; // increase the value in the array to track the votes
    System.out.println("Vote successfully cast.");
    break;
    default:
    System.out.println("Incorrect option entered."); // Display if user did incorrect input
  }
  
}

  public static void resetVotes(int[] Can1, int[] Can2, int[] Can3){ // method to reset all votes
    Can1[0] = 0; // reset all arrays value to 0
    Can2[0] = 0;
    Can3[0] = 0;
    System.out.println("Votes have been reset");
  }
  public static void displayResults(int[] Can1, int[] Can2, int[] Can3){ // method to display all votes
    System.out.println(" Votes for candidate 1: " + Can1[0]); // Value in the array is the amount of votes
    System.out.println(" Votes for candidate 2: " + Can2[0]);
    System.out.println(" Votes for candidate 3: " + Can3[0]);
  }
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int[] Can1 = {0}; // initialize arrays to hold vote values
    int[] Can2 = {0};
    int[] Can3 = {0};
    System.out.println("Voting System Program");
    
    boolean goagain = true; // boolean to keep switch going until user input
    while (goagain) {
        
    System.out.println("Enter a number to choose an operation: 1: CastVote 2: DisplayResults 3: ResetVotes 4: Exit ");
    int userinput = myObj.nextInt();
    switch (userinput) { // Switch to decide user operation
        case 1:
        castVote(Can1, Can2, Can3);
        break;
        case 2:
        displayResults(Can1, Can2, Can3);
        break;
        case 3:
        resetVotes(Can1, Can2, Can3);
        break;
        default:
        System.out.println("Thank you for using the program");
        goagain = false;
    }
}
    
    myObj.close();
  }
}
