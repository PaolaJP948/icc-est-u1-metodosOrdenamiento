public class BubbleSort {
    public BubbleSort(){
        System.out.println("Se creo la clase en el constructor ");
    }

    
    public void sortAscendente (int numeros[]) {
        for (int i = 0 ;  i <numeros.length; i++){
            for (int j = i + 1; j < numeros.length; j++){
                //comparacion
                if (numeros[i]> numeros[j]){
                // si cumple -> intercambio
                    int aux = numeros[1];
                    numeros[i]= numeros [j];
                    numeros[j]= aux; 
                }

            }
        }
    }

    public void sortDescendet (int[] numeros) {
         for (int i = 0 ;  i >numeros.length; i++){
            for (int j = i + 1; j < numeros.length; j++){
                //comparacion
                if (numeros[i]> numeros[j]){
                // si cumple -> intercambio
                    int aux = numeros[1];
                    numeros[i]= numeros [j];
                    numeros[j]= aux; 
                }

            }
        }
    

    }
        public void printArreglo(int[] numeros) {
            for (int i : numeros){
                System.out.print(i + ", ");

            }
        }
