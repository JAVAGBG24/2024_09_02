public class Engine {
    private int horsepower;
    private boolean isOn;

    // Konstrukto
    // konstruktorn talar om hur vi får skapa ett objekt av klassen Engine
    // i det här fallet så måste vi ange hästkrafter och vi sätter ett initialt värde
    // på isOn till false = motorn är avstängd från start
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
