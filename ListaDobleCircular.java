public class ListaDobleCircular 
{

    private Nodo head;

    public ListaDobleCircular() {
        this.head = null;
    }

    // ─────────────────────────────────────────────
    // 6.1 Insertar al Inicio
    // ─────────────────────────────────────────────
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (head == null) {
            // Lista vacía: el nodo apunta a sí mismo
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior  = nuevoNodo;
            head = nuevoNodo;
        } else {
            Nodo ultimo = head.anterior;

            nuevoNodo.siguiente = head;
            nuevoNodo.anterior  = ultimo;
            ultimo.siguiente    = nuevoNodo;
            head.anterior       = nuevoNodo;
            head                = nuevoNodo; // nuevo nodo pasa a ser la cabeza
        }
    }

    // ─────────────────────────────────────────────
    // 6.2 Insertar al Final
    // ─────────────────────────────────────────────
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (head == null) {
            // Lista vacía: el nodo apunta a sí mismo
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior  = nuevoNodo;
            head = nuevoNodo;
        } else {
            Nodo ultimo = head.anterior;

            nuevoNodo.siguiente = head;
            nuevoNodo.anterior  = ultimo;
            ultimo.siguiente    = nuevoNodo;
            head.anterior       = nuevoNodo;
            // head NO se modifica (diferencia con insertar al inicio)
        }
    }

    // ─────────────────────────────────────────────
    // 6.3 Eliminar al Inicio
    // ─────────────────────────────────────────────
    public void eliminarAlInicio() {
        if (head == null) {
            System.out.println("Error: la lista está vacía. No se puede eliminar.");
            return;
        }

        if (head.siguiente == head) {
            // Un solo nodo
            head = null;
        } else {
            Nodo ultimo = head.anterior;
            head             = head.siguiente;
            head.anterior    = ultimo;
            ultimo.siguiente = head;
        }
    }

    // ─────────────────────────────────────────────
    // 6.4 Eliminar al Final
    // ─────────────────────────────────────────────
    public void eliminarAlFinal() {
        if (head == null) {
            System.out.println("Error: la lista está vacía. No se puede eliminar.");
            return;
        }

        if (head.siguiente == head) {
            // Un solo nodo
            head = null;
        } else {
            Nodo ultimo     = head.anterior;
            Nodo penultimo  = ultimo.anterior;
            penultimo.siguiente = head;
            head.anterior       = penultimo;
        }
    }

    // ─────────────────────────────────────────────
    // 6.5 Buscar un Elemento
    // ─────────────────────────────────────────────
    public String buscar(int valorBuscado) {
        if (head == null) {
            return "No encontrado (lista vacía).";
        }

        Nodo actual = head;
        do {
            if (actual.dato == valorBuscado) {
                return "Encontrado: " + valorBuscado + " está en la lista.";
            }
            actual = actual.siguiente;
        } while (actual != head);

        return "No encontrado: " + valorBuscado + " no está en la lista.";
    }

    // ─────────────────────────────────────────────
    // 6.6 Recorrer e Imprimir la Lista (código de referencia)
    // ─────────────────────────────────────────────
    public void imprimir() {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo actual = head;
        System.out.print("Lista: ");
        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        } while (actual != head);
        System.out.println("(circular -> " + head.dato + ")");
    }
}
