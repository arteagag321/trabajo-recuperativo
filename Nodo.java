public class Nodo {
    int data;
    Nodo next;
    Nodo prev;

    public Nodo(int data) {
        this.data = data;
        this.next = this;
        this.prev = this;
    }
}
