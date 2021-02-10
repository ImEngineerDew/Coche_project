package Coche_Proyecto.Componentes;
import java.util.Scanner;
import java.util.ArrayList;


public class templateTruck extends Coche {
    private int loadCapacity;                //Quantity of the load about of this truck
    private int passengersQuantity;          //Quantity of seats on this truck
    private String typeLoad;

    private ArrayList<templateTruck> truckModel = new ArrayList<>();

    public void addTruck(templateTruck added) {
       truckModel.add(added);
    }

    public templateTruck() {
        super();
        this.loadCapacity = 4;               /*Capacidad en volumen*/
        this.typeLoad = "Ganado";
    }

    public templateTruck(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather, int loadCapacity, String typeLoad) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
        this.loadCapacity = loadCapacity;
        this.typeLoad = typeLoad;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String getTypeLoad() {
        return typeLoad;
    }

    @Override
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    @Override
    public boolean leatherSeats(String seatsLeather) {
        if (seatsLeather.equals("si")) {
            return true;
        } else
        {
            return false;
        }
    }

    @Override
    public void getInfo()
    {
        int tires, doors, load;
        String brand, fuel, leather, tiresString,doorsString,loadString,typeString;
        boolean exit = false;

        do {
            System.out.println("You're selected the truck option, please choose the number: ");
            System.out.println("1. Creating a truck ");
            System.out.println("2. Showing a truck ");
            System.out.println("3. Deleting a truck ");
            System.out.println("4. Exit the secondary menu");

            Scanner option = new Scanner(System.in);
            int opt = option.nextInt();

            switch(opt)
            {
                case 1:
                    Scanner objeto = new Scanner(System.in);
                    Scanner objetoNum = new Scanner(System.in);

                    System.out.println("Creating the truck...");

                    System.out.println("Please write the brand of the car: ");
                    brand = objeto.nextLine();
                    System.out.println("Which kind of the fuel has the car?: ");
                    fuel = objeto.nextLine();
                    System.out.println("Has the truck the leather seats? :");
                    leather = objeto.nextLine();
                    System.out.println("Please write the quantity of tires: ");
                    tiresString = objetoNum.nextLine();
                    System.out.println("Please write the number of doors: ");
                    doorsString = objetoNum.nextLine();
                    System.out.println("Please wite the quantity of load: ");
                    loadString = objetoNum.nextLine();
                    System.out.println("Please write the kind of load: ");
                    typeString = objeto.nextLine();

                    tires = Integer.parseInt(tiresString);
                    doors = Integer.parseInt(doorsString);
                    load  = Integer.parseInt(loadString);

                    templateTruck camion = new templateTruck(doors,tires,fuel,brand,leather,load,typeString);
                    truckModel.add(camion);
                    break;

                case 2:
                    System.out.println("Truck list info: ");
                    System.out.println("\n");
                    for(templateTruck lista: truckModel)
                    {
                        System.out.println(lista.getBrandCar()+"\t"+lista.getLoadCapacity()
                                +"\t"+lista.getTypeLoad()+"\t"+lista.getFuelMotor()+"\t"
                                +"\t"+lista.getDoorQuantity()+"\t"+lista.getTiresQuantity());
                    }
                    break;

                case 3:
                    System.out.println("Under construction, please wait on a few days");
                    break;

                case 4:
                    exit= true;
                    break;
            }
        }while(!exit);
    }
}








