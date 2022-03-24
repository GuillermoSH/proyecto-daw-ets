package es.iespuerto.ets;

import java.net.Proxy.Type;

public class Game {
    private long serialVersionUID;
    private int width;
    public Type field;
    public Game(long serialVersionUID, int width, Type field) {
        this.serialVersionUID = serialVersionUID;
        this.width = width;
        this.field = field;
    }
    public long getSerialVersionUID() {
        return serialVersionUID;
    }
    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public Type getField() {
        return field;
    }
    public void setField(Type field) {
        this.field = field;
    }
    
}
