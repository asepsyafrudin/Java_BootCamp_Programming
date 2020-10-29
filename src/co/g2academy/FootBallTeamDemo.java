package co.g2academy;

import java.util.Scanner;

public class FootBallTeamDemo {
    public static void main(String[] args) {
        String name;
        int numberOfMember = 4;
        Scanner input = new Scanner(System.in);
        FootBallTeam team1 = new FootBallTeam() ;

        System.out.print("Enter your team Name : ");
        String teamName = input.nextLine();
        team1.setTeamName(teamName);

        for (int i = 0 ; i < numberOfMember; i ++) {
            System.out.print("Enter Your Members : ");
            name = input.nextLine();
            team1.setMembers(i , name);
        }

        team1.displayMembers();



    }

}
