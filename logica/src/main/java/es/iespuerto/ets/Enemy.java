package es.iespuerto.ets;

/**
 * Esta clase se encarga de establecer las caracteristicas que tienen los
 * enemigos dentro del juego
 * 
 * @author Jonathan
 * @param color      Color de los enemigos (puede variar)
 * @param amount     Cantidad de enemigos
 * @param difficulty propiedad de dificultad de enemigos
 */
public class Enemy {
    public String color;
    public String difficulty;
    public byte amount;

    /**
     * Constructor que genera la estructura basica de los enemigos
     * 
     * @param color      Se refiere a la propiedad color de la clase
     * @param difficulty Dificultad del enemigo
     * @param amount     Cantidad de los enemigos
     */
    public Enemy(String color, String difficulty, byte amount) {
        this.color = color;
        this.difficulty = difficulty;
        this.amount = amount;
    }

    /**
     * Getter para mostrar el color del enemigo
     * 
     * @return devuelve el color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter donde se puede ajustar el color
     * 
     * @param color Propiedad color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter que muestar la dificultad
     * 
     * @return Devuelve la dificultad del enemigo en esa intancia
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * Setter para introducir una dificultad
     * 
     * @param difficulty Propiedad dificultad
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Getter muestra la cantidad de enemigos spameados
     * 
     * @return devuelve la vantidad
     */
    public byte getAmount() {
        return amount;
    }

    /**
     * Setter introduce la cantidad de enemigos
     * 
     * @param amount se refiere a la cantidad
     */
    public void setAmount(byte amount) {
        this.amount = amount;
    }

}