package Proj1;

import java.util.Scanner;

/**
 * League table
 */
public class Proj {

    private static Scanner in = new Scanner(System.in);

    /**
     * Team name
     */
    private static String[] names;

    /**
     * Team points
     */
    private static int[] points;

    /**
     * Team positive goals
     */
    private static int[] pGoals;

    /**
     * Team negative goals
     */
    private static int[] nGoals;

    public static void main(String[] args) {

        createTable();

        int choice;
        do {
            choice = getChoice();
            switch (choice) {
                 case 1:
                    insertResult();
                    break;
                case 2:
                    printTable();
                    break;
            }
        } while (choice != 0);
    }

    /**
     * Returns user choice
     * @return The user choice
     */
    private static int getChoice() {
        System.out.println("0. exit");
        System.out.println("1. insert result");
        System.out.println("2. print table");
        System.out.print("enter your choice >> ");
        return in.nextInt();
    }

    /**
     * Prints the league table
     */
    private static void printTable() {

        System.out.println("----------the table----------");
        System.out.format("%s \t%s \t%s \t%s\n", "name", "points", "pGoles", "nGoles");
        for (int i = 0; i < names.length; ++i) {
            System.out.format("%s \t\t%d \t\t%d \t\t%d\n", names[i], points[i], pGoals[i], nGoals[i]);
        }
        System.out.println("----------------------------");
    }

    /**
     * Creates table.
     */
    private static void createTable() {
        System.out.print("enter number of teams >> ");
        int size = in.nextInt();
        names = new String[size];
        points = new int[size];
        pGoals = new int[size];
        nGoals = new int[size];
        for (int i = 0; i < size; ++i) {
            System.out.print("enter the " + (i + 1) + "th team name >> ");
            names[i] = in.next();
        }
    }

    /**
     * Insets game result
     */
    private static void insertResult() {
        System.out.print("enter <home team> <far team> <home team goals> <far team goals> >> ");
        String homeTeamName = in.next();
        String farTeamName = in.next();
        int homeTeamGoals = in.nextInt();
        int farTeamGoals = in.nextInt();
        update(homeTeamName, homeTeamGoals, farTeamGoals);
        update(farTeamName, farTeamGoals, homeTeamGoals);
        sort();
    }

    /**
     * Updates table after a new game for a given team
     * @param teamName The name of the team
     * @param teamPGoals The team positive goals
     * @param teamNGoals The team negative goals
     */
    private static void update(String teamName, int teamPGoals, int teamNGoals) {
        int i = whereIs(teamName);
        pGoals[i] += teamPGoals;
        nGoals[i] += teamNGoals;
        if (teamPGoals > teamNGoals) {
            points[i] += 3;
        } else if (teamPGoals == teamNGoals) {
            points[i] += 1;
        }
    }

    /**
     * Returns the index of a given team in the table
     * @param teamName The name of the given team
     * @return - The index of the given team in the table
     */
    private static int whereIs(String teamName) {
        for (int i = 0; i < names.length; ++i) {
            if (names[i].equals(teamName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Sorts the table
     */
    private static void sort() {
        for (int i = 1; i < names.length; ++i) {
            String teamName = names[i];
            int teamPoints = points[i];
            int teamPGoals = pGoals[i];
            int teamNGoals = nGoals[i];
            int j;
            for (j = i; j > 0 && compare(j, j - 1) > 0; --j) {
                names[j] = names[j - 1];
                points[j] = points[j - 1];
                pGoals[j] = pGoals[j - 1];
                nGoals[j] = nGoals[j - 1];
            }
            names[j] = teamName;
            points[j] = teamPoints;
            pGoals[j] = teamPGoals;
            nGoals[j] = teamNGoals;
        }
    }

    /**
     * Compares two team
     * @param teamIndex1 The first team index
     * @param teamIndex2 The second team index
     * @return Negative number if the first team in the table should be after the second team.
     *         Positive number if the first team should be before the second team in the table.
     *         Zero, otherwise.
     */
    private static int compare(int teamIndex1, int teamIndex2) {
        int r = points[teamIndex1] - points[teamIndex2];
        if (r != 0) {
            return r;
        }
        r = (pGoals[teamIndex1] - nGoals[teamIndex1]) - (pGoals[teamIndex2] - nGoals[teamIndex2]);
        if (r != 0) {
            return r;
        }
        return 0;
    }
}
