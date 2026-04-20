public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        runBubbleSort(); 
    }
    public static void runBuddlesort(){
        System.out.println("Metodo Burbuja");
        int[] numeros = {-5, 10, 2, 0, 7};
        //instanciar de la clase 
        BubbleSort bubbleSort = new BubbleSort();
        //bubbleSort.printArreglo(numeros);
        //bubbleSort.sortAscendente (numeros);
        //bubbleSort.printArreglo (numeros);
        //bubbleSort.sortDescendet(numeros);
        //bubbleSort.printArreglo (numeros);

        bubbleSort.printArreglo (numeros);
        bubbleSort.sort(numeros, asc: True);
        bubbleSort.printArreglo (numeros);
        bubbleSort.sort(numeros, asc: False);
         bubbleSort.printArreglo (numeros);



    }
}
