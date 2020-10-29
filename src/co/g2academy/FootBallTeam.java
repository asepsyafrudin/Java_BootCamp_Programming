package co.g2academy;

public class FootBallTeam {
    private String teamName;
    private String[] members = new String[4];

    public void setTeamName(String name) {
        teamName = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMembers(int number, String name) {
        members[number] = name;
    }

    public String getMembers(int number) {
        return members[number];
    }

    public void displayMembers () {
        System.out.println("\nYour Team Name is : " + getTeamName());
        System.out.print("\tYour Members is : ");
        for (int i = 0; i < members.length; i++) {
            System.out.print(getMembers(i));
            if (i != members.length - 1) {
                System.out.print(" , ");
            } else {
                System.out.println(" . ");
            }
        }
    }

}
