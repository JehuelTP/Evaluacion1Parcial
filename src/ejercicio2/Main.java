package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[5];
        vehiculos[0] = new Vehiculo("Toyota", "Rav4", 16000);
        vehiculos[1] = new Vehiculo("Jac", "J6", 9500);
        vehiculos[2] = new Vehiculo("Toyota", "Starlet", 3900);
        vehiculos[3] = new Vehiculo("Subaru", "Impreza", 5000);
        vehiculos[4] = new Vehiculo("Jeep", "Wangler", 4000);

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecio() >= 2500 && vehiculo.getPrecio() <= 4000) {
                System.out.println("Marca: " + vehiculo.marca + "   Modelo: " + vehiculo.modelo + "   Precio: " + vehiculo.precio);
            }
        }
    }
}
