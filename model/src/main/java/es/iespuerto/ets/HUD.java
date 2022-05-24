package es.iespuerto.ets;

/**
 * Clase que se encarga de establecer la interface grafica del usuario
 * 
 * @param score      puntuacion
 * @param level      nivel donde se encuentra el jugador
 * @param greenValue
 * @param health     vida del jugador
 * 
 * @author Jonathan
 */
public class HUD {
    private int score;
    private int level;
    private int greenValue;
    private int health;

    /**
     * Contructor que inicia la interfaz grafica
     * 
     * @param score      variable a ingresar tipo int del puntuacion
     * @param level      variable a ingresar tipo int del nivel
     * @param greenValue
     * @param health     variable a ingresar con la vida del jugador
     */
    public HUD(int score, int level, int greenValue, int health) {
        this.score = score;
        this.level = level;
        this.greenValue = greenValue;
        this.health = health;
    }

    /**
     * Getters y setters de las variables miembro de la clase
     */
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
