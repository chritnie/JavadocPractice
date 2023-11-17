package learn.java.doc;

import learn.java.doc.model.World;


public class Application {

    /**
     * The main function entry point for the Java program.
     * <p>
     * Starts the World thread.
     * @since 1.0.0
     * @author all-creator
     */
    void main() {
        new Thread(new World()).start();
    }
}
