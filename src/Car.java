public class Car {
    private String color;
    private String model;
    private int speed;
    private Engine engine;

    public Car(String color, String model, int horsepower) {
        this.color = color;
        this.model = model;
        this.engine = new Engine(horsepower);
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

  /*  public void setModel(String newModel) {
        model = newModel;
    }*/

    public String getModel() {
        return model;
    }

    void start() {
        engine.start();
        //metodkropp, skriver vad metoden ska göra
        System.out.println("Bilen är startad.");
    }

    void stop() {
        engine.stop();
        System.out.println("Bilen har stannat.");
    }

    void accelerate(int increase) {
        speed += increase;
        System.out.println("Bilen kör nu i " + speed + " km/h");
    }

    public void printInfo() {
        System.out.println("Bilens märke är: " + model);
        System.out.println("Bilen färg är " + color);
        System.out.println("Bilens hästkraft är " + engine.getHorsepower());
    }
}
