package Principal;

import matriz.Matriz;
import fichero.Fichero;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fichero fich = new Fichero();
		String [] fichero = fich.leerFichero("documentacion/Iris2Clases.txt");
		/*for(int i = 0; i < fichero.length;i++)
		{
				System.out.println(fichero[i]);
		}
		*/
		double [][]A ={{5,6,2,1,3},
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}};
		double [][]B ={{5,6,2},
                {1,2,3},
                {6,7,8},
                {11,12,13},
                {16,17,18}};
		Matriz m = new Matriz();
		m.mostrarMatriz(m.multiplicar2matrices(A, B));
		double [][] tras = m.matrizTranspuesta(A);
		//m.mostrarMatriz(A);
		System.out.println("-----------------");
		//m.mostrarMatriz(tras);
		
	
		
		
		
	}
	

}
