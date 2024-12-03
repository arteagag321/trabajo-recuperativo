public class ListaCircularDoble {
    private Nodo head = null;


    public void insertar(int data) {
        Nodo nuevo = new Nodo(data);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo tail = head.prev;
            tail.next = nuevo;
            nuevo.prev = tail;
            nuevo.next = head;
            head.prev = nuevo;
        }
    }


    public boolean eliminar(int data) {
        if (head == null) return false;
        Nodo current = head;
        do {
            if (current.data == data) {
                if (current == head && head.next == head) {
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head) head = current.next;
                }
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }


    public Nodo buscar(int data) {
        if (head == null) return null;
        Nodo current = head;
        do {
            if (current.data == data) return current;
            current = current.next;
        } while (current != head);
        return null;
    }


    public void ordenar(boolean ascendente) {
        if (head == null || head.next == head) return;
        Nodo current, index;
        int temp;
        for (current = head; current.next != head; current = current.next) {
            for (index = current.next; index != head; index = index.next) {
                if (ascendente ? current.data > index.data : current.data < index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }


    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        if (head == null) return "Lista vacía";
        Nodo current = head;
        do {
            sb.append(current.data).append(" ");
            current = current.next;
        } while (current != head);
        return sb.toString();
    }
}
