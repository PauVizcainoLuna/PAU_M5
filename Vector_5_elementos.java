package vector_5_elementos;

/**
 *
 * @author Pau Vizcaino
 */
public class Vector_5_elementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        int suma = 0;           //Variable para la suma de valores dentro de array
        int resultado;          //Resultado de la suma de valores de array

        //Creamos la nueva array
        int[] numeros = {20, 65, 30, 12, 45};

        //Imprimimos array
        System.out.println("/////Imprimimos array/////");
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("llista[" + i + "]=" + numeros[i]);
        }

        //Sumamos los valores de dentro
        System.out.println("");
        System.out.println("/////Sumamos los valores de Array/////");
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        resultado = suma;
        System.out.println("El resultado es " + resultado);

        //Elemento mayor
        System.out.println("");
        System.out.println("/////Elemento mayor y menor/////");
        System.out.println("");

        int mayor = numeros[0];       //Designamos el numero mayor como el primero
        int menor = numeros[0];       //Designamos el numero menor como el primero

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es " + menor);

        //Valor en medio del array
        System.out.println("");
        System.out.println("/////Elemento en medio del array/////");
        System.out.println("");
        
        System.out.println("El valor del medio es " +  numeros[numeros.length/2]);
    }
}
