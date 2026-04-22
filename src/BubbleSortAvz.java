public class BubbleSortAvz {
    //variable global porque va a funcionar para toda la clase;
    int[] array;//tiene valor? no tiene valor
                //donde le doy valor? en el constructor
    public BubbleSortAvz(int [] arreglo){
        //1ra forma darle valor directo
        //array = new int[]{10, 5, 0};
        //2da forma darle valor en base a parametro
        this.array = arreglo;   //(this hace referencia a instanciar internamente en una clase
    }

    public void sort(boolean asc){
        int tam = array.length;
        boolean huboIntercambio;
        int contComparaciones = 0;
        for(int i=0; i< tam-1;i++){
            huboIntercambio = false;
            for(int j=0; j< tam -1 -i; j++){ //se pone -1 para que siga comparando y -i para que no compare con el anterior elemento
                contComparaciones++;
                if(array[j]> array[j+1]){
                    huboIntercambio = true;
                    int aux = array[j];
                    array[j] = array[j+1];
                    array [j+1] = aux; 
                }
            }
            if(!huboIntercambio){ //mejora de comparaciones
                break;
            }
        }
        System.out.println("Comparaciones totales:" + contComparaciones);

    }

    public void printArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printArray'");
    }

}
