package ED;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class TestVector {
  
  @Test
  public void insertar() throws VectorLlenoException {
    
    //Comprueba si el numero introducido es el correcto.
    CVector vector = new CVector();
    
    vector.insertar(0);
    assertEquals(vector.posicion(0),0);
    
    // Comprueba que si intentamos meter mas de 100 numeros en el vector lanza una exepcion.
    CVector vectorLleno = new CVector();
    try {
      for (int i = 0; i < 102; i++) {
        vectorLleno.insertar(0);
      }
    }catch(Exception e){
      boolean a = false; 
      assertFalse(a);
    }
  }
  
  @Test
  public void vector_lleno() throws VectorLlenoException {
    
    //Comprueba que cuando el vector esta lleno da true.
    
    CVector vectorLleno = new CVector();
    
    for (int i = 0; i < 100; i++) {
      vectorLleno.insertar(0);
    }
    
     boolean a = vectorLleno.vector_lleno();
     assertTrue(a);
     
     //Comprueba que cuando el vector no esta lleno da false.
     CVector vectorNoLleno = new CVector();
     
     boolean b = vectorNoLleno.vector_lleno();
     assertFalse(b);
  }
  
  @Test
  public void ordenar_vector() throws VectorLlenoException {
    
    //Creo un array con los valores del array desordenado, ordeno el vector y lo meto en otro array para 
    //posteriormente compararlos y ver si son iguales.
    CVector vector = new CVector();
    vector.insertar(3);
    vector.insertar(1);
    vector.insertar(2);
    
    int[] VectorB = new int[] {vector.posicion(0),vector.posicion(1),vector.posicion(2)};
    
    vector.ordenar_vector();
    
    int[] vectorA = new int[] {vector.posicion(0),vector.posicion(1),vector.posicion(2)};
    
    Arrays.sort(VectorB);
    
    assertArrayEquals(vectorA,VectorB);
  }
  
  @Test
  public void posicion() throws VectorLlenoException {
    
    //Compruebo que si se insertan numero se corresponden con la posicion dicha..
    CVector vector = new CVector();
    vector.insertar(1);
    vector.insertar(3);
    vector.insertar(5);
    
    boolean a = (vector.posicion(0) == 1);
    assertTrue(a);
    boolean b = (vector.posicion(1) == 3);
    assertTrue(b);
    boolean c = (vector.posicion(2) == 5);
    assertTrue(c);
    
    
    //Compruebo que cuando la posicion introducida es mayor que la longitud del array lanza una excepcion.
    try {
      vector.posicion(5);
    }catch(ArrayIndexOutOfBoundsException e) {
      boolean d = false; 
      assertFalse(d);
    }
    
    
  }
  
  
  
}
