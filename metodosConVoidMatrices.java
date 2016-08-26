package IIsemestre2014;
import java.io.*;

/**
 *
 * @author Juanito
 */
public class metodosConVoidMatrices{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader (new InputStreamReader(System.in));        // TODO code application logic here
    int  M[][]=new int [5][5], f = 0,c=0;
    while(f<2){
        f++;c=0;
        
        while(c<2){
                    c++;
                    System.out.print("introdusca un valor ");
                    M[f][c]=Integer.parseInt(dato.readLine());        
        }
    }
   imprimirMatriz(M);
    
    
    
    }
    public static void imprimirMatriz(int [][] M){
    int f,D=0,c,C; 
        f=0;   
    while(f<2){
          System.out.println("");  
       f++;
       c=0;
       
       while(c<2){
           c++;
           System.out.print(" "+M[f][c]+" ");
           
           }
          
       }
    
    }

}
         
        // TODO code application logic here
    


        
        
    
    

