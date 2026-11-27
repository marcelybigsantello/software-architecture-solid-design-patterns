package com.masantello.designpatterns.behavioralpatterns.template.exercise;

public class Volleyball extends Sport {

    public Volleyball(int scoreTeamA, int scoreTeamB) {
        super(scoreTeamA, scoreTeamB);
    }

    @Override
    protected void initializeGame() {
        System.out.println("\nInitializing the sport: " + this.getClass().getSimpleName());
    }

    @Override
    protected void playing() {
        System.out.println("They are playing: " + this.getClass().getSimpleName());
    }

    @Override
    protected void scoringTeamA() {
        System.out.println("The player from team A has scored!");
        scoreTeamA++;
    }

    @Override
    protected void scoringTeamB() {
        System.out.println("The player from team B has scored!");
        scoreTeamB++;
    }

    @Override
    protected void showResults() {
        if (scoreTeamA > scoreTeamB) {
            System.out.println("The winner of the game: Team A with " + scoreTeamA + " points.");
        } else if (scoreTeamA < scoreTeamB) {
            System.out.println("The winner of the game: Team B with " + scoreTeamB + " points.");
        } else {
            System.out.println("There was a tie!! " + scoreTeamA + " X " + scoreTeamB);
        }
    }
}
