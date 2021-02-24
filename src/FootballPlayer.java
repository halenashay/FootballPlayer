//Author: Halena Wetton
//Date: February 23 2021
//File: FootballPlayer.java

//Define public class
public class FootballPlayer {

    //Declare fields
    public String teamName;
    private String name;
    private double weight;
    private int height;
    private String position;
    private boolean eligibleToPlay;

    //Method FootballPlayer assigns playerName and true eligibilityToPlay
    public FootballPlayer(String playerName) {
        name = playerName;
        eligibleToPlay = true;
    }

    //Method setWeight
    public void setWeight(double playerWeight) {
        this.weight = playerWeight;
    }

    //Method setHeight
    public void setHeight(int playerHeight) {
        this.height = playerHeight;
    }

    //Method setPosition
    public void setPosition(String playerPosition) { this.position = playerPosition; }

    //Method setPlayersEligibility
    public void setPlayersEligibilty(boolean yesOrNo) {
        if (yesOrNo) {
            this.eligibleToPlay = true;
        } else {
            this.eligibleToPlay = false;
        }
    }

    //Method getName
    public String getName() {
        return name;
    }

    //Method getWeight
    public double getWeight() {
        return weight;
    }

    //Method getHeight
    public int getHeight() {
        return height;
    }

    //Method getPosition
    public String getPosition() {
        return position;
    }

    //Method getPlayersEligibility
    public boolean getPlayersEligibility() {
        return eligibleToPlay;
    }

    //Method workout
    public void workout() {
        if (weight <= 150) {
            System.out.println(name + " did 50 push ups and ran 100 miles.");
        } else if (weight <= 200) {
            System.out.println(name + " did 75 push ups and ran 70 miles.");
        } else if (weight <= 250) {
            System.out.println(name + " did 100 push ups and ran 40 miles.");
        } else {
            System.out.println("Legend has it that " + name + " is still doing push ups...");
        }


    }

}

//Declare FootballTeam class
 class FootballTeam {
    public static void main(String[] args) {

        //New football player 1 and assign values
        FootballPlayer player1 = new FootballPlayer("Russel Wilson");
        player1.setHeight(71);
        player1.setWeight(206);
        player1.setPosition("quarterback");
        player1.teamName = "Central Wildcats";

        //New football player 2 and assign values
        FootballPlayer player2 = new FootballPlayer("Tyler Lockett");
        player2.setHeight(71);
        player2.setWeight(170);
        player2.setPosition("wide receiver");
        player2.teamName = "Central Wildcats";

        //New football player 3 and assign values
        FootballPlayer player3 = new FootballPlayer("Cristiano Ronaldo");
        player3.setHeight(74);
        player3.setWeight(184);
        player3.setPosition("kicker");
        player3.teamName = "Central Wildcats";

        //New football player 4 and assign values
        FootballPlayer player4 = new FootballPlayer("Dwayne Johnson");
        player4.setHeight(77);
        player4.setWeight(260);
        player4.setPosition("running back");
        player4.teamName ="Central Wildcats";

        //Call workouts for players
        player1.workout();
        player2.workout();
        player3.workout();
        player4.workout();
    }

}

