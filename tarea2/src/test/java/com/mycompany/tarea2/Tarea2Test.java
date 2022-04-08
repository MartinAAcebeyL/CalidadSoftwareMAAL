package com.mycompany.tarea2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tarea2Test {
    
    public Tarea2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//a)	Si es obligatorio y es docente devolver: actualizar.
//b)	Si no es obligatorio y es docente devolver: matricular 
//c)	Si es externo y estado registro por Confirmar entonces: actualizar
//d)	Si es externo y destinatario externo entonces: registrar   
//e)	Si es externo y estado de registro vigente: matricular

    @Test
    public void testObtenerAccion_a() {
        System.out.println("obtenerAccion test A");
        String esObligatorio = "si";
        Boolean esDocente = true;
        Boolean esExterno = null;
        String tipoPersonaDestino = "";
        String estadoRegistro = "";
        String expResult = "actualizar";
        String result = Tarea2.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAccion_b() {
        System.out.println("obtenerAccion test B");
        String esObligatorio = "no";
        Boolean esDocente = true;
        Boolean esExterno = null;
        String tipoPersonaDestino = "";
        String estadoRegistro = "";
        String expResult = "matricular";
        String result = Tarea2.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAccion_c() {
        System.out.println("obtenerAccion test C");
        String esObligatorio = "";
        Boolean esDocente = null;
        Boolean esExterno = true;
        String tipoPersonaDestino = "";
        String estadoRegistro = "porConfirmar";
        String expResult = "actualizar";
        String result = Tarea2.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAccion_d() {
        System.out.println("obtenerAccion test D");
        String esObligatorio = "";
        Boolean esDocente = null;
        Boolean esExterno = true;
        String tipoPersonaDestino = "externo";
        String estadoRegistro = "";
        String expResult = "registrar";
        String result = Tarea2.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAccion_e() {
        System.out.println("obtenerAccion test E");
        String esObligatorio = "";
        Boolean esDocente = null;
        Boolean esExterno = true;
        String tipoPersonaDestino = "";
        String estadoRegistro = "vigente";
        String expResult = "matricular";
        String result = Tarea2.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
    }
}