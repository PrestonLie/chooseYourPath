import java.util.Scanner;
public class ChooseYourPath {

public static String acceptValidInput(int numOptions )
{
    String choice;
    boolean validInput = false;
    Scanner userInput = new Scanner(System.in);
    
    choice = userInput.nextLine();
    if ( choice.matches("[0-9]") )
    {
        int choiceNumber = Integer.parseInt(choice);
        if (( choiceNumber > 0 ) && ( choiceNumber <= numOptions ))
        {
            validInput = true;
        }
    }

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
public static void goBack()
{
    System.out.println("You have now gone back to California and didnt reach the goal. Game Over.");
}
public static void finished()
{
    System.out.println("You have made it to New York! You Win.");
}
public static void dangerousRoute()
{
    System.out.print("You chose the dangerous path. There seems to be a bridge above lava. ");
    System.out.println("Funny enough it doesnt seem that dangerous because you are just a bubble so you flow right past it.");
    System.out.println("Now there are just two paths that say California and one that says New York. You can also decide if you want to back. Which path do you choose?");
    System.out.println("1. Go to the California path");
    System.out.println("2. Go to the New York path");
    System.out.println("3. Go back from where you started");
    String choice = acceptValidInput(3);

    if ((choice.compareTo("1") == 0) || (choice.compareTo("3") == 0))
    {
        goBack();
    }
    else
    {
        finished();
    }
}
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
    System.out.println("The forest was scary but you managed to get through it without popping.");
    System.out.println("You then found two signs that lead to different paths. The first sign says fast but dangerous, while the second one says easy but long.");
    System.out.println("1. Go the Fast but Dangerous Route");
    System.out.println("2. Go the Long but Easy Route.");
    String choice = acceptValidInput(2);
   
    if (choice.compareTo("1") == 0) 
    {
        dangerousRoute();
    }
    else
    {
        easyRoute();
    }
}


public static void passTheObject()
{
    System.out.println("You walked passed the green object and kept on going throught the desert.");
    System.out.println("Now you decide if you want to travel through the forest or to the ocean. What do you choose?");
    System.out.println("1. Go through the forest");
    System.out.println("2. Go to the Ocean");
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

public static void touchTheObject()
{
    System.out.println("The object was a cactus and the bubble popped.");
}
public static void goToDesert()
{
    System.out.println("You have chosen the Desert path. You see a green object in the distance do you touch it?.");
    System.out.println("1. Touch the green object");
    System.out.println("2. Walk Passed it");
    String choice = acceptValidInput(2);

    if (choice.compareTo("1") == 0) 
    {
        touchTheObject();
    }
    else
    {
        passTheObject();
    }
}

public static void goToRoad()
{
    System.out.println("You have chosen the Road path. You can either stay on the left side of the road or the Right side. What do you chose?");
    System.out.println("1. Left side of the road");
    System.out.println("2. Right side of the road");
    String choice = acceptValidInput(2);
}

public static void main(String[] args)
{
    String S;
    System.out.print("The adventure starts off with a bubble travelling across the United States from California to New York. ");
    System.out.println("You will need to pick the paths that the bubble will go to reach its destination.");
    System.out.println("1. Take the path that leads to the Desert");
    System.out.println("2. Take the road path");
    String choice = acceptValidInput(2);

    // The user chose 1
    if ((choice.compareTo("1") == 0) || (choice.compareTo("3") == 0))
    {
        goToDesert();
    }
    else // The user chose 2
    {
        goToRoad();
    }
}
}
