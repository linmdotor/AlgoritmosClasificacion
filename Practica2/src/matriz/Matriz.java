package matriz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 *
 * @author paxx
 */
public class Matriz {
    static BufferedReader entrada =new BufferedReader(new InputStreamReader(System.in));        
    public static int opc, fila, colum, fila2, colum2;
    public static double [][] m1;
    public static double [][] m2;
    /**
     * @param args the command line arguments
     */
    
    public Matriz()
    {
    }
    public void mostrarMatriz(double [][] matriz)
    {
    	 for(int f=0;f<matriz.length;f++) {
	            for(int c=0;c<matriz[f].length;c++) {
	                System.out.print(matriz[f][c]+" ");
	            }
	            System.out.println();
	        }
    }
    /*
    public static void main(String[] args) throws IOException {                
        do
        {  
            System.out.print("Opcionesn " );
            System.out.print("1.- Introducir matriz A n " );
            System.out.print("2.- Introducir matriz B n " );
            System.out.print("3.- A + B n " );
            System.out.print("4.- A - B n " );
            System.out.print("5.- A * B n " );
            System.out.print("6.- Det(A) n  " );
            System.out.print("7.- A ^ t n " );
            System.out.print("8.- A ^ -1 n " );
            System.out.print("0.- SALIR n " );        
            System.out.print("Elige una opcion " );
            opc=Integer.parseInt( entrada.readLine());
            switch(opc){
                case 1: matriz1();
                        break;
                case 2: matriz2();
                        break;
                case 3: sumar();
                        break;
                case 4: restar();
                        break;
                case 5: multi();
                        break;
                case 6: deta();
                        break;
                case 7:traa();
                        break;
                case 8:inva();
                        break;            
            }
        }while(opc!=0);       
    }*/
 
    private static void sumar(double [][]mat1,double [][]mat2) throws IOException {
    	
    	m1 = mat1.clone();
    	m2 = mat2.clone();
        if(fila==fila2 && colum==colum2)
        {        
        for( int x=0;x<fila;x++)
        {
            for( int y=0;y<colum;y++)
            {
                System.out.print((m1[x][y])+(m2[x][y])+" , ");                
            }   
            System.out.print("n");
        }
 
        }else{
            System.out.print("no se pude sumar las matrices " );
        }
    }
 
    private static void matriz1() throws IOException {
        System.out.print("tamaño de filas " );
        fila=Integer.parseInt( entrada.readLine());
        System.out.print("tamaño de columnoas " );
        colum=Integer.parseInt( entrada.readLine());
        m1= new double [fila][colum];
        for(int i=0;i<fila;i++){
            for(int j=0;j<colum;j++){
                System.out.print("valor de matriz en ["+(i+1)+" , "+(j+1)+" ]" );
                m1[i][j]=Double.parseDouble( entrada.readLine());
            }            
        }
    }
 
    private static void matriz2() throws IOException {
        System.out.print("tamaño de filas " );
        fila2=Integer.parseInt( entrada.readLine());
        System.out.print("tamaño de columnoas " );
        colum2=Integer.parseInt( entrada.readLine());
        m2= new double [fila2][colum2];
        for(int i=0;i<fila2;i++){
            for(int j=0;j<colum2;j++){
                System.out.print("valor de matriz en ["+i+1+" , "+(j+1)+" ]" );
                m2[i][j]=Double.parseDouble( entrada.readLine());
            }            
        }
    }
 
  
 
    private static void restar(double [][]mat1,double [][]mat2) {
    	m1 = mat1.clone();
    	m2 = mat2.clone();
        if(fila==fila2 && colum==colum2)
        {        
        for( int x=0;x<fila;x++)
        {
            for( int y=0;y<colum;y++)
            {
                System.out.print((m1[x][y])-(m2[x][y])+" , ");                
            }   
            System.out.print("n");
        }        
        }else{
            System.out.print("no se pude restar las matrices " );
        }
    }
 

 
    public static double [][] multiplicar2matrices(double [][]mat1,double [][]mat2) {
    	m1 = mat1.clone();
    	m2 = mat2.clone();
    	
    	int col1 = 0;
    	double [][] r1=new double[fila][colum2];
    	for(int f=0;f<m1.length;f++) 
    	{fila = f;
            for(int c=0;c<m1[f].length;c++) {
            	colum = c;
            }
         }
    	for(int f=0;f<m2.length;f++) 
    	{fila2 = f;
            for(int c=0;c<m2[f].length;c++) {
            	colum2 = c;
            }
         }
    	if(colum==fila2)
        {        
            
            for(int x=0;x<fila;x++)
            {
                for(int y=0;y<colum2;y++)
                {
                    for(int m=0;m<colum;m++)
                    {
                        r1[x][y]+=m1[x][m]*m2[m][y];
                    }
                    System.out.print(r1[x][y]+" , ");                
                }
                System.out.print("n");
            }                
        }else{
            System.out.print("No se puede multiplicar matrices");
           
        }
    	return r1;
    }
 
    private static void multi2(double [][]mat1,double [][]mat2) throws IOException {
    	m1 = mat1.clone();
    	m2 = mat2.clone();
    	if(colum2==fila)
        {        
            double [][] r1=new double[fila2][colum];
            for(int x=0;x<fila2;x++)
            {
                for(int y=0;y<colum;y++)
                {
                    for(int m=0;m<colum2;m++)
                    {
                        r1[x][y]+=m2[x][m]*m1[m][y];
                    }
                    System.out.print(r1[x][y]+" , ");                
                }
                System.out.print("n");
            }                
        }else{
            System.out.print("No se puede multiplicar matrices");
            String a=entrada.readLine();
        }
    }
 
    private static void deta(double [][]mat1,double [][]mat2) throws IOException {
    	m1 = mat1.clone();
    	m2 = mat2.clone();
    	if(fila==colum){            
            System.out.print("La determinante es : "+determinante(m1));
            String a=entrada.readLine();
        }else{
            System.out.print("La Matriz no tiene determinante");
            String a=entrada.readLine();
        }
    }
 
    public static double determinante(double[][] matriz){
    	
    	double det;
        if(matriz.length==2){
            det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
            return det;
        }
        double suma=0;
        for(int i=0; i<matriz.length; i++){
        double[][] nm=new double[matriz.length-1][matriz.length-1];
            for(int j=0; j<matriz.length; j++){
                if(j!=i){
                    for(int k=1; k<matriz.length; k++){
                    int indice=-1;
                    if(j<i)
                    indice=j;
                    else if(j>i)
                    indice=j-1;
                    nm[indice][k-1]=matriz[j][k];
                    }
                }
            }
            if(i%2==0)
            suma+=matriz[i][0] * determinante(nm);
            else
            suma-=matriz[i][0] * determinante(nm);
        }
        return suma;
    }
 
    private static void detb() throws IOException {
        if(fila2==colum2){            
            System.out.print("La determinante es : "+determinante(m2));        
            String a=entrada.readLine();
        }else{
            System.out.print("La Matriz no tiene determinante");
            String a=entrada.readLine();
        }
    }
 
    public static void traa(double [][]mat1) throws IOException {                
        System.out.print("La matriz original");
        System.out.print("n");
        m1 = mat1.clone();
        for(int x=0;x<fila;x++)
        {
            for(int y=0;y<colum;y++)
            {
                System.out.print(m1[x][y]+ " , ");     
            }   
            System.out.print("n");
        }
        System.out.print("nn");
        System.out.print("La matriz transpuesta");
        System.out.print("n");
        for(int x=0;x<colum;x++)
        {
            for(int y=0;y<fila;y++)
            {
                System.out.print(m1[y][x]+ " , ");     
            }   
            System.out.print("n");
        }        
        String a=entrada.readLine();
    }
 
    private static void trab(double [][]mat2) throws IOException {
        System.out.print("La matriz original");
        System.out.print("n");
        m2 = mat2.clone();
        for(int x=0;x<fila2;x++)
        {
            for(int y=0;y<colum2;y++)
            {
                System.out.print(m2[x][y]+ " , ");     
            }   
            System.out.print("n");
        }
        System.out.print("nn");
        System.out.print("La matriz transpuesta");
        System.out.print("n");
        for(int x=0;x<colum2;x++)
        {
            for(int y=0;y<fila2;y++)
            {
                System.out.print(m2[y][x]+ " , ");     
            }   
            System.out.print("n");
        }        
        String a=entrada.readLine();
    }
 

 
    public static double[][] matrizInversa(double[][] matriz) {
        double det=1/determinante(matriz);
        double[][] nmatriz=matrizAdjunta(matriz);
        multiplicarMatriz(det,nmatriz);
        return nmatriz;
    }
 
    public static void multiplicarMatriz(double n, double[][] matriz) {
        for(int i=0;i<matriz.length;i++)
        for(int j=0;j<matriz.length;j++)
        matriz[i][j]*=n;
    }
 
    public static double[][] matrizAdjunta(double [][] matriz){
        return matrizTranspuesta(matrizCofactores(matriz));
    }
 
    public static double[][] matrizCofactores(double[][] matriz){
        double[][] nm=new double[matriz.length][matriz.length];
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz.length;j++) {
                double[][] det=new double[matriz.length-1][matriz.length-1];        
                double detValor;
                for(int k=0;k<matriz.length;k++) {
                    if(k!=i) {
                        for(int l=0;l<matriz.length;l++) {
                            if(l!=j) {
                            int indice1=k<i ? k : k-1 ;
                            int indice2=l<j ? l : l-1 ;
                            det[indice1][indice2]=matriz[k][l];
                            }
                        }
                    }
                }
                detValor=determinante(det);
                nm[i][j]=detValor * (double)Math.pow(-1, i+j+2);
            }
        }
        return nm;
    }
 
    public static double[][] matrizTranspuesta(double [][] matriz){
        double[][]nuevam=new double[matriz[0].length][matriz.length];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++)
                nuevam[i][j]=matriz[j][i];
        }
        return nuevam;
    }
 
}