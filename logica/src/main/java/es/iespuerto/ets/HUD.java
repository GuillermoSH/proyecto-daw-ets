package es.iespuerto.ets;

public class HUD {
    private int score,level,greenValue;
    public int health;
    
    public HUD(int score, int level, int greenValue, int health) {
        this.score = score;
        this.level = level;
        this.greenValue = greenValue;
        this.health = health;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public void setGreenValue(int greenValue) {
        this.greenValue = greenValue;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
}
