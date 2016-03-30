/* 
    Nombre del programa: Program_5
    Nombre: Andrés David Mojica Ospina
    Fecha: 29-03-2016
    Descripción: Clase que permite probar los metodos del programa 5
*/
package test;

import controller.Distribucion;
import controller.Reporte;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestProgram 
{
    Distribucion distribucion = new Distribucion(1.1, 9);
    Reporte reporte = new Reporte();
    String resultado = "";
    String resultado_reporte = "";
    
    @Before
    public void setUp() 
    {
        resultado = distribucion.getDistribucion();
        resultado_reporte = reporte.getReporte();
    }
    
    @Test
    public void testDistribucion()
    {
        assertEquals("0,35006", resultado);
    }
    
    @Test
    public void testReporte()
    {
        assertEquals("<table style='width:400px;border:1px solid black;'><tr><td>x</td><td>dof</td><td>p - expected</td><td>p - actual</td></tr><tr><td>0 to x=1.1</td><td>9</td><td>0.35006</td><td>0,35006</td></tr><tr><td>0 to x=1.1812</td><td>10</td><td>0.36757</td><td>0,36757</td></tr><tr><td>0 to x=2.750</td><td>30</td><td>0.49500</td><td>0,49500</td></tr></table>", resultado_reporte );
    }
    
}
