package es.iespuerto.ets;

/**
 * Clase que se encarga de establecer la interface grafica del usuario
 * 
 * @author Jonathan
 *         score puntuacion
 *         level nivel donde se encuentra el jugador
 *         greenValue
 *         health vida del jugador
 */
public class HUD {
    private int score, level, greenValue;
    public int health;

    /**
     * Contructor que inicia la interfaz grafica
     * 
     * @param score      variable a ingresar tipo int del puntuacion
     *                   level variable a ingresar tipo int del nivel
     * @param greenValue
     *                   health variable a ingresar con la vida del jugador
     */
    public HUD(int score, int level, int greenValue, int health) {
        this.score = score;
        this.level = level;
        this.greenValue = greenValue;
        this.health = health;
    }

    /**
     * 
     * @return devuelve puntacion
     */
    public int getScore() {
        return score;
    }

    /*
     * ingresa puntuacion
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * 
     * @return devuelve nivel
     */
    public int getLevel() {
        return level;
    }

    /**
     * 
     * @param level ingresa nivel
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * 
     * @return retorna valor
     */
    public int getGreenValue() {
        return greenValue;
    }

    /**
     * 
     * @param greenValue parametro entero
     */
    public void setGreenValue(int greenValue) {
        this.greenValue = greenValue;
    }

    /**
     * 
     * @return retorna la vida del jugador
     */
    public int getHealth() {
        return health;
    }

    /*
     * ingresa vida jugador
     */
    public void setHealth(int health) {
        this.health = health;
    }

}
