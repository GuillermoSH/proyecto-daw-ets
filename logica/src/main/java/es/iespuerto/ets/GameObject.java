package es.iespuerto.ets;

public class GameObject {
    protected int x,y,veIX,veIY;
    protected ID id;
    public GameObject(int x, int y, int veIX, int veIY, ID id) {
        this.x = x;
        this.y = y;
        this.veIX = veIX;
        this.veIY = veIY;
        this.id = id;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getVeIX() {
        return veIX;
    }
    public void setVeIX(int veIX) {
        this.veIX = veIX;
    }
    public int getVeIY() {
        return veIY;
    }
    public void setVeIY(int veIY) {
        this.veIY = veIY;
    }
    public ID getId() {
        return id;
    }
    public void setId(ID id) {
        this.id = id;
    }

}
