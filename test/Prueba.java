
import javaapplication1.Complejo;
import javaapplication1.Funciones;
import javaapplication1.Polar;

import org.junit.Test;
import static org.junit.Assert.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicolas
 */
public class Prueba {
    
    @Test
    public void sumaTest() {
        Funciones app = new Funciones();
        Complejo a= new Complejo(4,3);
        Complejo b  = new Complejo(1,-5);
        Complejo respuesta = app.Suma(a, b);
        Complejo c = new Complejo(5,-2);
        assertEquals(respuesta.toString(), c.toString());
    }
     @Test
    public void restaTest() {
        Funciones app = new Funciones();
        Complejo n1 = new Complejo(6,5);
        Complejo n2 = new Complejo(1,-5);
        Complejo respuesta = app.Resta(n1, n2);
        Complejo esperado = new Complejo(5,10);
        assertEquals(respuesta.toString(), esperado.toString());
    }
     @Test
    public void multiplicacionTest() {
        Funciones app = new Funciones();
        Complejo a = new Complejo(4,3);
        Complejo b = new Complejo(5,-7);
        Complejo respuesta = app.Producto(a, b);
        Complejo c = new Complejo(41,-13);
        assertEquals(respuesta.toString(), c.toString());
    }
}