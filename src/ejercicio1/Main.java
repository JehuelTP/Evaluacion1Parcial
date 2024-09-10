package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", 23, 2500);
        empleados[1] = new Empleado("Ana", 21, 3200);
        empleados[2] = new Empleado("Pedro", 22, 2900);

        for (Empleado empleado: empleados){
            empleado.aumentarSalario();
        }
    }
}
