package Coche_Proyecto.Componentes;
import java.util.Scanner;
import java.util.ArrayList;

public class templateVehicle extends Coche {
    private String esPublico;
    private int passengersQuantity;

    private ArrayList <templateVehicle> carModel = new ArrayList <>();

    private void addCar(templateVehicle agregado)
    {
        carModel.add(agregado);
    }

    public templateVehicle() {
        super();
    }

    public templateVehicle(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather, String esPublico) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
        this.esPublico = esPublico;
    }

    public void getInfo(){ }

    @Override
    public boolean leatherSeats(String seatsLeather) {
        if (seatsLeather.equals("si")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    public boolean servicioPublico(String esPublico) {
        if (esPublico.equals("si")) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarCarro() {
        
    }
}
