import java.util.Scanner;

public class OnlineGamePlayer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username;
        String characterName;
        int level;
        long experiencePoints;
        String rank;

        System.out.print("Enter username: ");
        username = input.nextLine();

        System.out.print("Enter character name: ");
        characterName = input.nextLine();

        System.out.print("Enter level: ");
        level = input.nextInt();

        System.out.print("Enter experience points: ");
        experiencePoints = input.nextLong();

        input.nextLine();

        System.out.print("Enter rank: ");
        rank = input.nextLine();

        System.out.println("\nPlayer Profile");
        System.out.println("Username: " + username);
        System.out.println("Character Name: " + characterName);
        System.out.println("Level: " + level);
        System.out.println("Experience Points: " + experiencePoints);
        System.out.println("Rank: " + rank);

        input.close();
    }
}
