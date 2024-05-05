public class MyPila<T> {
    class Nodo<T>{
        Nodo<T> next;
        T dato ;
        public Nodo(T dato) {
            this.dato=dato;
            this.next=null;
        }

    }
    Nodo<T> top;
    int size;
    public MyPila() {
        this.top = null;
        this.size=0;

    }
    public void apilar(T dato) {
        Nodo<T> newN = new Nodo<>(dato);
        if(isEmpty()) {
            top = newN;
            newN = null;
            size++;
        }else {
            Nodo<T> actual = top;

            top = newN; top.next = actual;
            size++;
        }
    }
    public T desapilar() {
        if(isEmpty()) {
            return null;
        }else {
            T dato = top.dato;
            top = top.next;
            return dato;
        }

    }
    public boolean isEmpty() {
        return top == null;
    }
    public int getSize() {
        return size;
    }
}
