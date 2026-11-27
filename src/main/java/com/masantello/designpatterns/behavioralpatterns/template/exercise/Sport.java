package com.masantello.designpatterns.behavioralpatterns.template.exercise;

public abstract class Sport {

    protected int scoreTeamA;
    protected int scoreTeamB;

    public Sport(int scoreTeamA, int scoreTeamB) {
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB = scoreTeamB;
    }

    protected abstract void initializeGame();
    protected abstract void playing();
    protected abstract void scoringTeamA();
    protected abstract void scoringTeamB();
    protected abstract void showResults();

    public final void playGame() {
        initializeGame();
        playing();
        scoringTeamA();
        scoringTeamB();
        showResults();
    }

}
