/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import conversor.Converter;
import conversor.ViewConversor;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class ConvertMsToKm {

    Converter con;

    @Before
    public void setUp() {
        con = new Converter(0, 0);
        System.out.println("Conversion de ms a Km/h");
    }
    @After
    public void after(){
        System.out.println("Test realizado.\n");
    }

    @Test
    public void Test1() {
        System.out.println("Test1");
        double actual = con.convertMsToKm(10);
        double expcted = 36;
        double delta = 0.01;
        assertEquals(expcted, actual, delta);
        System.out.println("Velocidad en m/s: 10 Velocidad en Km/h: " + expcted);

    }

    @Test
    public void Test2() {
        System.out.println("Test2");
        double actual = con.convertMsToKm(50);
        double expcted = 180;
        double delta = 0.01;
        assertEquals(expcted, actual, delta);
        System.out.println("Velocidad en m/s: 50 Velocidad en Km/h: " + expcted);

    }

    @Test
    public void Test3() {
        System.out.println("Test3");
        double actual = con.convertMsToKm(100);
        double expcted = 360;
        double delta = 0.01;
        assertEquals(expcted, actual, delta);
        System.out.println("Velocidad en m/s: 100 Velocidad en Km/h: " + expcted);

    }

    
    @Test
    public void testIntegracion(){
        ViewConversor vc = new ViewConversor();
        assertEquals(0,vc.pruebaIntegracion(), 0);
    }
}
