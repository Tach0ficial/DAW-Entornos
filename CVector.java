/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;

/**
 *
 * @author Lorenzo
 */
public class CVector {
    private int[] vector;
    private int nElementos;
    
    /**
     * Constructor de la clase
     */
    public CVector(){
        vector= new int[100];
        nElementos=0;     
    }
    
    /**
     * Inserta un elemento en el vector en caso de no haber llegado al límite. En otro caso se genera una excepción
     * @param elemento
     * @throws VectorLlenoException
     */
    public void insertar(int elemento) throws VectorLlenoException{
        if (nElementos<=100){
            vector[nElementos]=elemento;
            nElementos++;
        } else {
            throw new VectorLlenoException();
        }
    }
    
    /**
     * Devuelve true si el vector está lleno y false en otro caso
     * @return
     */
    public boolean vector_lleno(){
        return (nElementos>=100);
    }
    
    /**
     * Ordena el vector en orden ascendente
     */
    public void ordenar_vector(){
        int i,j,temp;
        
        for (i=0; i<nElementos-1; i++){
            for (j=i+1;j<nElementos; j++){
                if (vector[i]>vector[j]){
                    temp=vector[j];
                    vector[j]=vector[i];
                    vector[i]=temp;
                }
            }
        }
    }
    
    /**
     * Imprime por pantalla los elementos del vector
     */
    public void mostrar_vector(){
        int i;
        
        for (i=0; i<nElementos; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.print("\n");
    }
    
    /**
     * Devuelve el elemento situado en la posición que se pasa como parámetro si es una posición válida. 
     * En otro caso se genera la excepción ArrayIndexOutOfBoundsException
     * @param pos
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public int posicion(int pos) throws ArrayIndexOutOfBoundsException {
        if (pos>=0 && pos<nElementos){
            return vector[pos];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
}
