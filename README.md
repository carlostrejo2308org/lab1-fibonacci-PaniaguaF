[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=9762281&assignment_repo_type=AssignmentRepo)


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calidad_y_pruebas;
//Hecho por Salvador Paniagua individualmente. :(
class Fibonnaci{  

	public static void main(String[] args) {

		int max = 100000000; //Numeros de la secuencia fibonacci que equeremos
		int numero1 = 0, numero2 = 1; //Numeros que empezaran la secuencia
        
		for (int i=1; numero1 < max; i++) {
			System.out.print(numero1 + "  ");
                
                        
			int n = numero1 + numero2;
			numero1 = numero2;
			numero2 = n;
                }
        }
}
