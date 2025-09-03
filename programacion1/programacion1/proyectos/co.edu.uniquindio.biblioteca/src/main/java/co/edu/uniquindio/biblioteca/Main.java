package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.*;


import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        Biblioteca biblioteca = inicializarDatos();
    int opcionSeleccionada = 0;

        do {
    mostrarMenu();
    opcionSeleccionada=leerEntero("Ingrese una opcion del menu:");

    switch (opcionSeleccionada) {
        case 1:
            String respuesta = crearCliente(biblioteca);
            System.out.println("Informacion del cliente" +respuesta);
            break;
        case 2:
            String respuesta1 = crearEmpleado(biblioteca);
            System.out.println("Informacion del empleado" +respuesta1);
            break;
        case 3:
            String respuesta2 = crearLibro(biblioteca);
            System.out.println("Informacion del libro" +respuesta2);
            break;
        case 4:
            Cliente cliente = obtenerCliente(biblioteca);
            int edad = leerEntero("Ingrese la edad del cliente a validar: ");
            String resultadoValidacion = validarEdadCliente(cliente, edad);
            System.out.println("Resultado de la operación: "+resultadoValidacion);
            break;
        case 5:
            String nombre =leerStringConsola("Ingrese el nombre del libro a validar: ");
            Libro libro=obtenerLibro(biblioteca, nombre);
            String resultadoValidacionNombre= validarNombreLibro(libro, nombre);
            System.out.println("Resultado validacion: "+resultadoValidacionNombre);
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



    public static String crearCliente(Biblioteca biblioteca){

        String nombre=leerStringConsola("Ingrese el nombre del cliente: ");
        String id=leerStringConsola("Ingrese el id del cliente: ");
        String telefono=leerStringConsola("Ingrese el telefono del cliente: ");
        int edad=leerEntero("Ingrese el edad del cliente: ");
        String direccion=leerStringConsola("Ingrese el direccion del cliente: ");

        Cliente cliente = new Cliente(nombre, id, telefono, edad, direccion);
        biblioteca.getListaClientes().add(cliente);

        return cliente.toString();


    }

  public static String crearEmpleado(Biblioteca biblioteca) {

        String nombre=leerStringConsola("Ingrese el nombre del empelado: ");
        String apellido=leerStringConsola("Ingrese el apellido del empleado: ");
        String cedula=leerStringConsola("Ingrese la cedula del empleado: ");
        int edad=leerEntero("Ingrese la edad del empleado: ");
        String direccion=leerStringConsola("Ingrese la direccion del empleado: ");

        Empleado empleado = new Empleado(nombre, apellido, cedula, edad, direccion);
        biblioteca.getListaEmpleados().add(empleado);

        return empleado.toString();
  }

  public static String crearLibro(Biblioteca biblioteca) {
        String nombre=leerStringConsola("Ingrese el nombre del libro: ");
        String id=leerStringConsola("Ingrese el id del libro: ");
        String autor=leerStringConsola("Ingrese el autor del lirbo: ");
        String editorial=leerStringConsola("Ingrese la editorial del libro: ");
        String año=leerStringConsola("Ingrese el año del libro: ");

        Libro libro = new Libro(nombre, id, autor, editorial, año);
        biblioteca.getListaLibros().add(libro);

        return libro.toString();
  }

  public static String validarEdadCliente(Cliente cliente, int edad) {
        if(cliente!=null){
            if(cliente.getEdad()==edad) {
                return "La edad del cliente es valida";
            } else {
                return "La edad del cliente no es valida";
            }
        } else {
            return "No se puede validar, el cliente no existe en el sistema";
        }
  }
  private static Cliente obtenerCliente(Biblioteca biblioteca){
        String idCliente=leerStringConsola("Ingrese el id del cliente a buscar: ");
        Cliente clienteEncontrado=null;
        for(int i=0;i<biblioteca.getListaClientes().size(); i++) {
            if(biblioteca.getListaClientes().get(i).getId().equals(idCliente)){
                clienteEncontrado=biblioteca.getListaClientes().get(i);
                break;
            }
        }
        return clienteEncontrado;
  }

    private static Biblioteca inicializarDatos() {

        Biblioteca biblioteca = new Biblioteca("UQ");

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setId("1094");
        cliente.setTelefono("87676768");
        cliente.setEdad(30);
        biblioteca.getListaClientes().add(cliente);

        return biblioteca;
    }




  public static String validarNombreLibro(Libro libro, String nombre) {
     if(libro!=null){
         if(libro.getNombre().equalsIgnoreCase(nombre)) {
             return "El nombre del libro es valido";
         } else {
             return "El nombre del libro es invalido";
         }
     } else {
         return "No se puede validar, el libro no existe en el sistema";
     }
  }

  private static Libro obtenerLibro(Biblioteca biblioteca, String nombre) {
      Libro libroEncontrado = null;
      for (int i = 0; i < biblioteca.getListaLibros().size(); i++) {
          if (biblioteca.getListaLibros().get(i).getNombre().equalsIgnoreCase(nombre)) {
              libroEncontrado = biblioteca.getListaLibros().get(i);
              break;
          }
      }
  return libroEncontrado;
  }
  }
