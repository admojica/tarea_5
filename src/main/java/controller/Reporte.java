/* 
    Nombre del programa: Program_5
    Nombre: Andrés David Mojica Ospina
    Fecha: 29-03-2016
    Descripción: Clase que permite realizar el reporte de una operación
*/
package controller;

public final class Reporte 
{
    String reporte;
    /* Metodo constructor de la clase */
    public Reporte()
    {
        Distribucion distribucion_1 = new Distribucion(1.1, 9);
        Distribucion distribucion_2 = new Distribucion(1.1812, 10);
        Distribucion distribucion_3 = new Distribucion(2.750, 30);

        reporte = " <table style='width:400px;border:1px solid black;'><tr><td></td><td>x</td><td>dof</td><td>p - expected</td><td>p - actual</td></tr>";
        reporte += "<tr><td>0 to x=1.1</td><td>9</td><td>0.35006</td><td>" + distribucion_1.getDistribucion() + "</td></tr>";
        reporte += "<tr><td>0 to x=1.1812</td><td>10</td><td>0.36757</td><td>" + distribucion_2.getDistribucion() + "</td></tr>";
        reporte += "<tr><td>0 to x=2.750</td><td>30</td><td>0.49500</td><td>" + distribucion_3.getDistribucion() + "</td></tr>";
        reporte += "</table>";
    }
    
    /* Metodo para retornar el resultado del reporte */
    public String getReporte()
    {
        return this.reporte;
    }
}