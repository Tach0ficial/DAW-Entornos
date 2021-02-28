package ED;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPasos {
  
  @BeforeAll
  static void testsComienzan() {
    System.out.println("TEST");
  }
  
  
  @AfterAll
  static void testsRealizados() {
    System.out.println("Se han hecho los test.");
  }
  
  @BeforeEach
  void testEmpezar() {
    System.out.println("Va a empezar el test");
  }
  
  @AfterEach
  void testTerminano() {
    System.out.println("El test a terminano");
  }

  
  @Test
  void testEsfuerzoNegativo() {
    Pasos p = new Pasos();
    int salida = p.esfuerzo(-1);
    assertEquals(-1, salida);
  }
  
  @Test
  void testEsfuerzo999999999() {
    Pasos p = new Pasos();
    int salida = p.esfuerzo(999999999);
    assertEquals(-2, salida);
  }
  
  @Test
  void testEsfuerzo0() {
    Pasos p = new Pasos();
    int salida = p.esfuerzo(0);
    assertEquals(1, salida);
  }
  
  @Test
  void testEsfuerzo1000() {
    Pasos p = new Pasos();
    int salida = p.esfuerzo(1000);
    assertEquals(2, salida);
  }
  
  @Test
  void testEsfuerzo2000() {
    Pasos p = new Pasos();
    int salida = p.esfuerzo(2000);
    assertEquals(3, salida);
  }
  
  @Test
  void testEsfuerzo4000() {
    Pasos p = new Pasos();
    int salida = p.esfuerzo(4000);
    assertEquals(4, salida);
  }
  
  @Test
  void testEsfuerzo6000() {
    Pasos p = new Pasos();
    int salida = p.esfuerzo(6000);
    assertEquals(5, salida);
  }

}
