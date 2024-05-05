// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyPila<Integer> myPila = new MyPila<>();
            myPila.apilar(40);
            myPila.apilar(20);
            myPila.apilar(12);
            myPila.apilar(48);
            myPila.apilar(10);

        eliminarElementos(myPila, 2, 4);

        // Mostrar los elementos restantes de la pila
        while (!myPila.isEmpty()) {
            System.out.println(myPila.desapilar());
        }
    }
    public static void eliminarElementos(MyPila<Integer> p, int nivelInf, int nivelSup){

        MyPila<Integer> ax = new MyPila<>();
        int c = 1;

        while (c < nivelInf) {
            ax.apilar(p.desapilar());
            c++;
        }

        while (c <= nivelSup) {
            p.desapilar();
            c++;
        }

        while (!ax.isEmpty()) {
            p.apilar(ax.desapilar());
        }

    }
}