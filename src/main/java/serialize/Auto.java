package serialize;

import java.io.Serializable;

public class Auto implements Serializable {

    private static final long serialVersionUID = 2L;

    Motor motor;
    String farbe;

    public Auto(){};

    public Auto(Motor motor, String farbe) {
        this.motor = motor;
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }
}
