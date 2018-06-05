package leccionextraclase;

public class LeccionExtraclase {

    public static void main(String[] args) {
        
        //Declaracion de variables y arreglos
        
        double[] lista1 = {110, 220, 430, 140, 250, 460};
        double[] lista2 = {10, 20, 30, 40, 50, 60};
        double[] lista3 = new double[6];
        double suma = 0;
        double promedio = 0;
        
        // este for se usara para dividir cada elemento de la lista 1 con cada elemento de la lista 2 para obtener el promedio y
        // se introduce cada resultado dentro de la lista 3 
        
        for (int contador = 0; contador < lista1.length; contador++) {
            double prom = lista1[contador] / lista2[contador];
            lista3[contador] = prom;
        }
        
        // El siguiente for se usara para presentar cada elemento de la lista 3 y se usa el System.out.printf para darle limite a los decimales
        
        for (int contador = 0; contador < lista1.length; contador++){
            System.out.printf("%.2f\n",lista3[contador]);
        }
        
        // El siguiente for se utiliza para sumar cada elemento de la lista 3 y obtener el promedio de la misma
        
        for (int contador = 0;contador < lista1.length; contador++){
            suma = suma + lista3[contador];
            promedio = suma / lista1.length;
        }
        
        // y por ultimo se presenta el promedio de la lista 3 mediante un System.out.printf para poder darle limite a los decimales
        
        System.out.printf("El promedio de la lista 3 es : %.2f",promedio);
    }

}
