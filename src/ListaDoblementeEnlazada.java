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

}
