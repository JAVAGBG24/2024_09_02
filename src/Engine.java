public class Engine {
    private int horsepower;
    private boolean isOn;

    // Konstruktor
    public Engine(int hp) {
        horsepower = hp;
        isOn = false;
    }

    public void start() {
        isOn = true;
        System.out.println("Motorn är igång.");
    }

    public void stop() {
        isOn = false;
        System.out.println("Motorn har stängts av");
    }

    public boolean isRunning() {
        return isOn;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
