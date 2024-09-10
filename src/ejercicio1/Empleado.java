package ejercicio1;

public class Empleado {
    String nombre;
    int edad;
    double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario() {
        if (salario < 3000) {
            salario += salario * 0.10;
            System.out.println(nombre+" ha recibido un aumento. " + "Nuevo Salaro: " +salario);
        } else {
            System.out.println(nombre +" no califica para el aumento");
        }
    }
}
