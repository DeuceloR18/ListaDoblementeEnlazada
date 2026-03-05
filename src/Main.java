import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome, programa lista doblemente enlazada");

        Scanner sc = new Scanner(System.in);
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        int opcion;

        do {

            System.out.println("\nBievenido! Lista Doblemente Enlazada: Elige una opcion: ");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer hacia adelante");
            System.out.println("4. Recorrer hacia atras");
            System.out.println("5. Mostrar tamaño");
            System.out.println("6. Lista vacia?");
            System.out.println("7. Buscar por valor");
            System.out.println("8. Buscar por indice");
            System.out.println("9. Borrar elemento");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Dato: ");
                    lista.insertarInicio(sc.nextInt());
                    System.out.print("Dato insertado al inicio");
                    break;

                case 2:
                    System.out.print("Dato: ");
                    lista.insertarFinal(sc.nextInt());
                    System.out.print("Dato insertado al final");
                    break;

                case 3:
                    lista.recorrerAdelante();
                    System.out.print("La lista recorrera hacia adelante");
                    break;

                case 4:
                    lista.recorrerAtras();
                    System.out.print("La lista recorrera hacia atras");
                    break;

                case 5:
                    System.out.println("Tamaño de la lista: " + lista.obtenerTamaño());
                    System.out.print("Exit: ");
                    break;

                case 6:
                    System.out.println(lista.estaVacia() ? "Lista vacia no se han ingresado datos" : "Lista con datos");
                    break;

                case 7:
                    System.out.print("Valor: ");
                    System.out.println(lista.buscarValor(sc.nextInt()));
                    System.out.print("Valor encontrado" );
                    break;

                case 8:
                    System.out.print("Indice: ");
                    System.out.println(lista.buscarIndice(sc.nextInt()));
                    System.out.print("Indice encontrado" );

                    break;

                case 9:
                    System.out.print("Valor a borrar: ");
                    lista.borrar(sc.nextInt());
                    System.out.print("Valor borrado correctamente! ");
                    break;

            }

        } while (opcion != 0);

    }
}