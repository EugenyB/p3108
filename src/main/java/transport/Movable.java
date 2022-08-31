package transport;

public interface Movable {
    void move();

    default void start() {
        System.out.println("started");
    }

    private void print() {

    }
}
