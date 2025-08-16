public class HolaMundo {
    static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    static class ListaSimple {
        Nodo cabeza;

        void agregar(int valor) {
            Nodo nuevo = new Nodo(valor);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Nodo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }

        void mostrar() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.print(actual.valor + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.mostrar();  // Salida: 10 -> 20 -> 30 -> null
    }
}
