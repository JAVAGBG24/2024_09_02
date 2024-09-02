public class Main {
    public static void main(String[] args) {
       Car car1 = new Car("Röd", "Volvo", 200);
       car1.printInfo();

        // från första exemplet när vi inte hade PRIVATE access modifier i Car klassen
        // det var så här vi satte värden på Cars egenskaper
      // car1.color = "Vit";
      // car1.model = "VW";
      // car1.speed = 0;

        // så här satte vi värde på color efter att vi satt egenskaperna till PRIVATE
        // access modifier. Vi skapade setter och getter metod för att komma åt och sätta/ändra värdet
        car1.setColor("Röd");
        // vi ville att man inte skulle kunna ändra sin bils märke
        // istället skapade vi en konstruktor i Car klassen så att vi var tvugna att ange model
        // och horsepower för motorn vid skapandet av Car objektet. Se rad 3 och 4
       // car1.setModel("Volvo");

       car1.start();
       car1.accelerate(50);

      //  System.out.println("Bilen är " + car1.color + " och är av märket " + car1.model);
      //  System.out.println("Bilen är " + car1.getColor() + " och är av märket " + car1.getModel());

        //Engine e = new Engine(200);
        //System.out.println(e.getHorsepower());

    }
}