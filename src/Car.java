public class Car {
    // private access modifier, vi kommer endast åt egenskaperna i klassen Car
    // eller med getter/setter metod, utan getter/setter kommer vi inte åt dom
    private String color;
    private String model;
    private int speed;
    // special fält som är av typen Engine, alltså vår egna klass
    private Engine engine;

    // KONSTRUKTOR
    // det är den som bestämmer HUR vi får skapa ett objekt av klassen Car
    // i det här fallet så säger vi att vi måste ange färg, märke samt hur många hästkrafter
    // motorn har.
    public Car(String color, String model, int horsepower) {
        this.color = color;
        this.model = model;
        // vi tar emot ett värde som kommer att representera hästkrafter
        // vi tar sedan det värdet och instansierar ett nytt objekt av klassen Engine
        // direkt när vi skapar Car objektet.
        this.engine = new Engine(horsepower);
    }

    // setter, sätter värdet på color
    public void setColor(String newColor) {
        color = newColor;
    }

    // getter, hämtar värdet på color
    public String getColor() {
        return color;
    }

    // vi tog bort vår setter för model så att man endast anger model vid skapandet av objektet
  /*  public void setModel(String newModel) {
        model = newModel;
    }*/

    // getter så att vi kan hämta värdet på model
    public String getModel() {
        return model;
    }

    // starta bilen, i första exemplet så använde vi inte Engines metoder det la vi till
    // nät vi byggde ut koden
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

    // en metod som printar ut all info om bilen
    public void printInfo() {
        System.out.println("Bilens märke är: " + model);
        System.out.println("Bilen färg är " + color);
        System.out.println("Bilens hästkraft är " + engine.getHorsepower());
    }
}
