package serialize;

import java.io.Serializable;

public class Motor implements Serializable {

    private static final long serialVersionUID = 2L;
    int hubraum;

    public Motor() {};

    public Motor(int hubraum) {
        this.hubraum = hubraum;
    }

    public int getHubraum() {
        return hubraum;
    }
}
