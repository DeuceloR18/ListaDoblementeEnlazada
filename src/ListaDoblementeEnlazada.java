public class ListaDoblementeEnlazada {
    Nodo cabeza;
    Nodo cola;
    int tamaño;

    public void ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int obtenerTamaño() {
        return tamaño;
    }

    //insert to initio and finish
    public void insertarInicio(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }

        tamaño++;
    }
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = cola = nuevo;

        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;

        }
        tamaño++;
    }


    //Metodos para recorrer la lista hacia adelante
    public void recorrerAdelante() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("null");
    }

    //Recorrer la lista hacia atras
    public void recorrerAtras() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.anterior;

        }
        System.out.println("null");
    }



    //metodos por busqueda
    public boolean buscarValor(int valor) {
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato == valor) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }
//buscar por indice
    public int buscarIndice(int indice) {
        Nodo actual = cabeza;
        int contador = 0;
        while (actual != null) {
            if (actual.dato == indice) {
                return actual.dato;
            }
            contador++;
            actual = actual.siguiente;
        }
        return -1;
    }

}
