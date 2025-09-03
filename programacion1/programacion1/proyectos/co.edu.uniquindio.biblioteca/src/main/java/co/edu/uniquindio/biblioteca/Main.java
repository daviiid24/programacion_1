package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Cliente;
import co.edu.uniquindio.biblioteca.model.Empleado;
import co.edu.uniquindio.biblioteca.model.Libro;


import java.util.Scanner;



public class Main {

    private static Cliente cliente1;
    private static Empleado empleado1;
    private static Libro libro1;

    public static void main(String[] args) {
    int opcionSeleccionada;

        do {
    mostrarMenu();
    opcionSeleccionada=leerEntero("Ingrese una opcion:");

    switch (opcionSeleccionada) {
        case 1:
            String respuesta = crearCliente();
            System.out.println(respuesta);
            break;
        case 2:
            String respuesta1 = crearEmpleado();
            System.out.println(respuesta1);
            break;
        case 3:
            String respuesta2 = crearLibro();
            System.out.println(respuesta2);
            break;
        case 4:
            String resultado = validarEdad();
            System.out.println(resultado);
            break;
        case 5:
            String resultado1 = validarNombreLibro();
            System.out.println(resultado1);
            break;
        case 6:
            System.out.println("Saliendo de la aplicacion");
        break;
        default:
            System.out.println("Opcion no valida");
        }
    } while (opcionSeleccionada != 6);
    }
    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }
    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

        public static void mostrarMenu() {
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Crear empleado");
            System.out.println("3 - Crear libro");
            System.out.println("4 - Validar edad del cliente");
            System.out.println("5 - Validar nombre del libro");
            System.out.println("6 - Salir");
        }



    public static String crearCliente(){

        String nombre=leerStringConsola("Ingrese el nombre del cliente: ");
        String id=leerStringConsola("Ingrese el id del cliente: ");
        String telefono=leerStringConsola("Ingrese el telefono del cliente: ");
        String edad=leerStringConsola("Ingrese el edad del cliente: ");
        String direccion=leerStringConsola("Ingrese el direccion del cliente: ");

        cliente1 = new Cliente(nombre, id, telefono, edad, direccion);

        return cliente1.toString();


    }

  public static String crearEmpleado() {

        String nombre=leerStringConsola("Ingrese el nombre del empelado: ");
        String apellido=leerStringConsola("Ingrese el apellido del empleado: ");
        String cedula=leerStringConsola("Ingrese la cedula del empleado: ");
        String edad=leerStringConsola("Ingrese la edad del empleado: ");
        String direccion=leerStringConsola("Ingrese la direccion del empleado: ");

        empleado1 = new Empleado(nombre, apellido, cedula, edad, direccion);

        return empleado1.toString();
  }

  public static String crearLibro() {
        String nombre=leerStringConsola("Ingrese el nombre del libro: ");
        String id=leerStringConsola("Ingrese el id del libro: ");
        String autor=leerStringConsola("Ingrese el autor del lirbo: ");
        String editorial=leerStringConsola("Ingrese la editorial del libro: ");
        String año=leerStringConsola("Ingrese el año del libro: ");

        libro1 = new Libro(nombre, id, autor, editorial, año);

        return libro1.toString();
  }

  public static String validarEdad() {
        String edadValidar=leerStringConsola("Ingrese una edad a validar: ");
        if (cliente1.getEdad().equals(edadValidar)) {
            return "Edad valida";
        } else {
            return "Edad invalida";
        }
  }

  public static String validarNombreLibro() {
      String nombreValidar=leerStringConsola("Ingrese una edad a validar: ");
        if (libro1.getNombre().equalsIgnoreCase(nombreValidar)) {
            return "El libro es igual";
        } else {
            return "El libro no es igual";
        }
  }
  }
