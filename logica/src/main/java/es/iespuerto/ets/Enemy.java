package es.iespuerto.ets;

public class Enemy {
    public String color;
    public String difficulty;
    public byte amount;

    public Enemy(String color, String difficulty, byte amount) {
        this.color = color;
        this.difficulty = difficulty;
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public byte getAmount() {
        return amount;
    }

    public void setAmount(byte amount) {
        this.amount = amount;
    }
    
}
