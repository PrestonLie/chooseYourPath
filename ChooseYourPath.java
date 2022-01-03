//Here I imported the scanner to scan the User Inputs
import java.util.Scanner;
public class ChooseYourPath {

// Here I created a way to validate that the user typed input that is a number within a given range. If the input
// is invalid, it asks them to input again so that they can retype a correct input.
public static String acceptValidInput(int numOptions )
{

    String choice;
    boolean validInput = false;

    // Use the Java Scanner Class
    Scanner userInput = new Scanner(System.in);
    
    // Receive the user input
    choice = userInput.nextLine();

    // To be valid, the input must be a single digit instead of a character string
    if ( choice.matches("[0-9]") )
    {
        // Convert the string into an integer
        int choiceNumber = Integer.parseInt(choice);

        // Check that the input is between 1 and the number of options passed in.
        if (( choiceNumber > 0 ) && ( choiceNumber <= numOptions ))
        {
            validInput = true;
        }
    }

    // Keep on looping collecting new input until the input is valid.
    while ( !validInput )
    {
        System.out.println("You need to pick a number between 1 and " + numOptions);
        choice = userInput.nextLine();
        if ( choice.matches("[0-9]") )
        {
            int choiceNumber = Integer.parseInt(choice);
            if (( choiceNumber > 0 ) && ( choiceNumber <= numOptions ))
            {
                validInput = true;
            }
        }
    }
    return choice;
}
//I set a method that tells the User if the path they took led to a incorrect or correct path.
public static void goBack()
{
    System.out.println("You have now gone back to California and didnt reach the goal. Game Over.");
}
//Since the route that the user took was correct, they won the game.
public static void finished()
{
    System.out.println("You have made it to New York! You Win.");
}
// Created a new method
public static void dangerousRoute()
{
    // Here I told the storyline of where they are at and the options they have to decide next.
    System.out.print("You chose the dangerous path. There seems to be a bridge above lava. ");
    System.out.println("Funny enough it doesnt seem that dangerous because you are just a bubble so you flow right past it.");
    System.out.println("Now there are just two paths that say California and one that says New York. You can also decide if you want to back. Which path do you choose?");
    System.out.println("1. Go to the California path");
    System.out.println("2. Go to the New York path");
    System.out.println("3. Go back from where you started");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(3);
//Now I made a compound bolean, where 2 paths lead back to California and the other path Wins.
    if ((choice.compareTo("1") == 0) || (choice.compareTo("3") == 0))
    {
        goBack();
    }
    else
    {
        finished();
    }
}
// Created a new method
public static void easyRoute()
{
    System.out.print("You chose the Easy route. The easy route wants you to travel around a huge lava pool. The time to travel around the lava took 300 years.");
    System.out.println(" The bubble popped from old age.");
}
public static void goThroughOcean()
{
    System.out.println("While you were travelling by ocean, a wave splashed up and hit the bubble. This caused the bubble to pop.");
}
public static void goThroughForest()
{
    // Here I told the storyline of where they are at and the options they have to decide next.
    System.out.println("The forest was scary but you managed to get through it without popping.");
    System.out.println("You then found two signs that lead to different paths. The first sign says fast but dangerous, while the second one says easy but long.");
    System.out.println("1. Go the Fast but Dangerous Route");
    System.out.println("2. Go the Long but Easy Route.");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);
   //This compares the 2 paths for the user to pick from.
    if (choice.compareTo("1") == 0) 
    {
        dangerousRoute();
    }
    else
    {
        easyRoute();
    }
}

// Created a new method
public static void passTheObject()
{
    // Here I told the storyline of where they are at and the options they have to decide next.
    System.out.println("You float passed the green object and kept on going throught the desert.");
    System.out.println("Now you decide if you want to travel through the forest or to the ocean. What do you choose?");
    System.out.println("1. Go through the forest");
    System.out.println("2. Go to the Ocean");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);
   
    if (choice.compareTo("1") == 0) 
    {
        goThroughForest();
    }
    else
    {
        goThroughOcean();
    }
}
// Created a new method
public static void touchTheObject()
{
    System.out.println("The object was a cactus and the bubble popped.");
}
// Created a new method
public static void goToDesert()
{
    // Here I told the storyline of where they are at and the options they have to decide next.
    System.out.println("You have chosen the Desert path. You see a green object in the distance do you touch it?.");
    System.out.println("1. Touch the green object");
    System.out.println("2. Float Passed it");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);
    //This compares the 2 paths for the user to pick from.
    if (choice.compareTo("1") == 0) 
    {
        touchTheObject();
    }
    else
    {
        passTheObject();
    }
}
// Created a new method
public static void goToMountain()
{
    System.out.println("As you were floating to a mountain you realized you were completely lost and stranded. You eventually popped.");
}
// Created a new method
public static void goToCity()
{
    System.out.println("You floated down the path to the city. Once you got to the city, you saw on a massive sign that said YOU MADE IT TO NEW YORK. You Win!");
}
// Created a new method
public static void keepStraight()
{
    // Here I told the storyline of where they are at and the options they have to decide next.
    System.out.print("You decided to keep on going straight, you managed to get to a road that split into two paths. ");
    System.out.println("The first sign says to go to a city, while the other says to go to a Mountain. What do you choose?");
    System.out.println("1. Go to city");
    System.out.println("2. Go to a Mountain");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);
    //This compares the 2 paths for the user to pick from.
    if (choice.compareTo("1") == 0) 
    {
        goToCity();
    }
    else
    {
        goToMountain();
    }
}
// Created a new method
public static void playInSnow()
{
    System.out.println("Since you wanted to play in the snow, as soon as a bit of snow got on the bubble, it popped.");
}
// Created a new method
public static void goStraight()
{
    // Here I told the storyline of where they are at and the options they have to decide next.
    System.out.println("You chose to go straight, you keep floating straight until you reach a large mountain with snow. You can either play in the snow or keep going straight.");
    System.out.println("1. Play in the snow");
    System.out.println("2. Keep going straight");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);
    //This compares the 2 paths for the user to pick from.
    if (choice.compareTo("1") == 0) 
    {
        playInSnow();
    }
    else
    {
        keepStraight();
    }
}
// Created a new method
public static void turnBack()
{
    System.out.println("The bubble gave up before it got to New York and went back to California. You Lose.");
}
// Created a new method
public static void rightSide()
{
    System.out.println("You have picked the right side. A fast car drove right passed you on the left lane.");
    System.out.println("The road now stops, either you can keep floating straight or you can turn back.");
    System.out.println("1. Go Straight");
    System.out.println("2. Turn Back");  
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);
    //This compares the 2 paths for the user to pick from.
    if (choice.compareTo("1") == 0) 
    {
        goStraight();
    }
    else
    {
        turnBack();
    }
}  
// Created a new method
public static void leftSide()
{
    System.out.println("You have picked the left side. When you were going down the road a car going full speed ran straight into the bubble. You Lose.");
}
// Created a new method
public static void goToRoad()
{
    System.out.println("You have chosen the Road path. You can either stay on the left side of the road or the Right side. What do you chose?");
    System.out.println("1. Left side of the road");
    System.out.println("2. Right side of the road");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);
    //This compares the 2 paths for the user to pick from.
    if (choice.compareTo("1") == 0) 
    {
        leftSide();
    }
    else
    {
        rightSide();
    }
}  

public static void main(String[] args)
{
    //This is where the adventure begins, and also where all of the code above is put into. Since the first 2 options are the Desert and Road.
    System.out.print("The adventure starts off with a bubble travelling across the United States from California to New York. ");
    System.out.println("You will need to pick the paths that the bubble will go to reach its destination.");
    System.out.println("1. Take the path that leads to the Desert");
    System.out.println("2. Take the road path");
    //This line of code tells the program that there are only 2 options that the user can pick from. 
    String choice = acceptValidInput(2);

    // The user chose 1
    if (choice.compareTo("1") == 0) 
    {
        goToDesert();
    }
    else // The user chose 2
    {
        goToRoad();
    }
}
}
