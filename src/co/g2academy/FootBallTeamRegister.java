package co.g2academy;

import java.util.Scanner;

public class FootBallTeamRegister {
    public static void main(String[] args) throws Exception {
        String name;
        int numberOfMember = 4; // Masukkan jumlah Member di setiap team
        int numberOfTeam = 3; // Masukkan jumlah team

        Scanner input = new Scanner(System.in);
        FootBallTeam[] team1 = new FootBallTeam[numberOfTeam] ;
        boolean startProgram = true;

try {
    while(startProgram) {
        System.out.println("\nWhat do you want??");
        System.out.println("Type 1 for enter the team");
        System.out.println("Type 2 for check Team Member");
        System.out.println("Type 3 for Exit");
        System.out.print("Please Enter Here >> ");
        int user = input.nextInt();
        input.nextLine();
        if(user == 1) {
            for(int y = 0 ; y<numberOfTeam; ++y) {
                team1[y] = new FootBallTeam();
                System.out.print("\nEnter your team Name : ");
                String teamName = input.nextLine();
                team1[y].setTeamName(teamName);

                for(int i = 0 ; i<numberOfMember; ++i) {
                    System.out.print("\tEnter your Members Name : ");
                    name = input.nextLine();
                    team1[y].setMembers(i , name);
                }
            }

            System.out.println("==============DATA ALREADY RECORDED================");


        } else if(user == 2) {
            boolean seeMember = true;
            do {
                System.out.print("\nInput Team Name's that you want to see the members or exit for exit : ");
                String inputTeam = input.nextLine();
                if(inputTeam.equals("exit"))  {
                    break;
                }

                System.out.println("Your Member of " + inputTeam + " : ");
                boolean check = false;
                for (int i = 0 ; i < numberOfTeam ; ++i) {
                    if(team1[i].getTeamName().equals(inputTeam)){
                        for (int j = 0 ; j< numberOfMember; ++j) {
                            System.out.print(team1[i].getMembers(j));
                            if(j == numberOfMember -1 ) {
                                System.out.print(" . ");
                            } else {
                                System.out.print(" , ");
                            }
                        }
                        check = true;
                    }
                }
                if(!check) {
                    System.out.print("Member Not Found!! Please Check Your Team Name");
                }

            }
            while(seeMember);

        } else if(user ==3) {
            startProgram = false;
        } else {
            System.out.println("Please Check your Submitted Number!!");
        }

    }

    System.out.println("Program Finished , Thank you for Using our Program");

} catch (Exception e) {

    System.out.println("Please Check Your Submitted Number!!!");

}

        }

    }

