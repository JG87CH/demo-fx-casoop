package serialize;

import java.io.*;

public class Serialize {
    public static void main(String[] args) throws IOException {
        new Serialize().start();
    }

    private void start() throws IOException {

        Motor motor = new Motor(1800);
        Auto a1 = new Auto(motor, "rot");

        OutputStream fos = new FileOutputStream("src/main/java/serialize/auto.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        oos.close();
    }
}
