/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import archivos.ExportarCSV;
import conexion.Conexion;
import gestion.Consultas;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        // TODO code application logic here

        Consultas c = new Consultas();

        c.iniciar();

        c.completarCaracteristicas();
        c.completarPrecios();

        c.mostrarVehiculos();

        ExportarCSV ex = new ExportarCSV();

        ex.exportarResultados(c.getSubCategoria(), c.getAntiguedad(), c.getArea_Construida(), c.getKilometro(),
                c.getArea_Total(), c.getAlquilerSemanal(), c.getMedio_Baño(), c.getDormitorios(), c.getBaños(),
                c.getAlquilerDia(), c.getCamas(), c.getCochera(), c.getFila(), c.getTipoEstadia(),
                c.getBalneario(), c.getUbicacion(), c.getAlquilerMensual(), c.getPrecio(),
                c.getMonedaSimbolo(), c.getFecha(), c.getEstadoPublicacion(),
                c.getPais(), c.getDepartamento());

    }

}
