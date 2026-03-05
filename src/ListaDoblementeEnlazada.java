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


}
