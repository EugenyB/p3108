package music;

public abstract class Instrument {

    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play(String melody) {
        for (int i = 0; i < melody.length(); i++) {
            playNote(melody.charAt(i));
        }
        System.out.println();
    }

    protected abstract void playNote(char note);
}

// public
// protected
//
// private