/* Author	:Jennifer Almaraz Suárez 
 * Correo	:almarazjennifer44@gmail.com
 * Fecha	:20211026 */ 

import java.util.Scanner;

public class Ordennum {
       public static void main (String neo[]) {
	       Scanner entrada = new Scanner (System.in);
	       int tamanio, x, y, z, cambioPosicion, orden; 

	       System.out.print("\nIngresa el numero de valores a ordenar");
	       tamanio = entrada.nextInt();

	       //Establecemos el tamaño del arreglo
	       int numeros[] = new int[tamanio]; 
	       
	       //Recibir valores del usuario "valores a ordenar"
	       for(x = 0; x < tamanio; x++){
		       System.out.print("\nIngresa el valor: ");
		       numeros[x] = entrada.nextInt();
	       }

	       for(z = 0; z < tamanio; z++){
		       for(y = 0; y < tamanio -1; y++){
			       if(numeros[y] > numeros [y + 1]){
				       cambioPosicion = numeros[y];
				       numeros[y] = numeros[y + 1]; 
				       numeros[y + 1] = cambioPosicion; 
			       }
		       }
	       }
	      System.out.print("\nOrden de impresion\n1)ascendente\n2)descendente :");
       	      orden = entrada.nextInt();

	      if (orden == 1){
		for(x = 0; x < tamanio; x++){
	  		System.out.print(numeros[x]+" , ");
		}
	      }else if(orden == 2){
		for(x = tamanio -1; x >= 0; x--){
		       System.out.print(numeros[x]+" , ");
	        }
 	      }else {
      		System.out.print("Opcion no valida");
    	      }
     }
} 
