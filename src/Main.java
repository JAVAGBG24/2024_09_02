public class Main {
    public static void main(String[] args) {
       Car car1 = new Car("Röd", "Volvo", 200);
       car1.printInfo();

      // car1.color = "Vit";
      // car1.model = "VW";
      // car1.speed = 0;

        car1.setColor("Röd");
       // car1.setModel("Volvo");

       car1.start();
       car1.accelerate(50);

      //  System.out.println("Bilen är " + car1.color + " och är av märket " + car1.model);
      //  System.out.println("Bilen är " + car1.getColor() + " och är av märket " + car1.getModel());

        //Engine e = new Engine(200);
        //System.out.println(e.getHorsepower());

    }
}