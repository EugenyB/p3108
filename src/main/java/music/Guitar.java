package music;

public class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    @Override
    protected void playNote(char note) {
        System.out.print("g:" + note + " ");
    }
}
