/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calidad_y_pruebas;
//Hecho por Salvador Paniagua individualmente. :(
class fibo{  

	public static void main(String[] args) {

		int max = 100; //Numeros de la secuencia fibonacci que equeremos

		int numero1 = 0, numero2 = -1; //Numeros que empezaran la secuencia
                //Update: Se puede elegir entre numeros negativos y positivos
        
		for (int i=1; numero1 < max; i++) {
			System.out.print(numero1 + " / ");
                        int n = numero1 + numero2;
			numero1 = numero2;
			numero2 = n;
                }
        }
}
        
        
