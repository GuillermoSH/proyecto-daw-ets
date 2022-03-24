package es.iespuerto.ets;

public class Player {
    public String UserId;

    public Player(String userId) {
        UserId = userId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
