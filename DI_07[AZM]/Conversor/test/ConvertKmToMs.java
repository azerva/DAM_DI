/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import conversor.Converter;
import conversor.ViewConversor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ConvertKmToMs {

    Converter con;

    @Before
    public void setUp() {
        con = new Converter(0, 0);
        System.out.println("Conversion de Km/h a ms");
    }
    
    @After
    public void after(){
        System.out.println("Test realizado correctamente.\n");
    }


 
    @Test
    public void Test1() {
        
        System.out.println("Test1");
        double actual = con.convertKmToMs(10);
        double expcted = 2.7778;
        double delta = 0.01;//Al ser un double generamos margen de error
        assertEquals(expcted, actual, delta);
        System.out.println("Velocidad en Km/h: 10 velocidad convertida a ms = 2.7778");
    }

    @Test
    public void Test2() {
        System.out.println("Test2");
        double actual = con.convertKmToMs(50);
        double expcted = 13.889;
        double delta = 0.01;
        assertEquals(expcted, actual, delta);
        System.out.println("Velocidad en Km/h: 50 velocidad convertida a ms = 13.889");
    }

    @Test
    public void Test3() {
        System.out.println("Test3");
        double actual = con.convertKmToMs(100);
        double expcted = 27.778;
        double delta = 0.01;
        assertEquals(expcted, actual, delta);
        System.out.println("Velocidad en Km/h: 100 velocidad convertida a ms = 27.778");
    }

    @Test
    public void testIntegracion(){
        ViewConversor vc = new ViewConversor();
        assertEquals(0,vc.pruebaIntegracion(), 0);
    }
}
