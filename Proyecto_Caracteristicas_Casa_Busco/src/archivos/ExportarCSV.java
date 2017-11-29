/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author user
 */
public class ExportarCSV {

    public ExportarCSV() {
    }

    public void exportarResultados(String subCategoria[],String dormitorios[], String[] baños, String[] area_Total, String[] antiguedad,
            String[] area_Construida, String[] kilometro, String[] medio_Baño, String[] camas, String[] cochera, String[] fila,
            String tipoEstadia[], String[] balneario, String[] ubicacion, String[] alquilerMensual, 
            String[] alquilerSemanal, String[] alquilerDia,
            String[] alquilerSemanaSanta, String[] alquilerAnioNuevo, String[] areaOriginal, 
            String[] areaConstruidaOriginal, String[] unidadMedidaAreaTerreno,
            String[] unidadMedidaAreaConstruida, float[] precio,String[] monedaSimbolo,String[] fecha,
            String[] estadoPublicacion,String[] pais, String[] departamento
    ) throws IOException {

        String outputFile = "C:/Users/user/Google Drive/Detalle_Carro_busco/bd_caracteristicas_casa_busco.csv";

        boolean alreadyExists = new File(outputFile).exists();

        if (alreadyExists) {
            File bd_detalle_20 = new File(outputFile);
            bd_detalle_20.delete();
        }

        CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

        csvOutput.write("id");
        csvOutput.write("subCategoria");
        csvOutput.write("dormitorios");
        csvOutput.write("baños");
        csvOutput.write("area_Total");
        csvOutput.write("antiguedad");
        csvOutput.write("area_Construida");
        csvOutput.write("kilometro");
        csvOutput.write("medio_baño");
        csvOutput.write("camas");
        csvOutput.write("cochera");
        csvOutput.write("fila");
        csvOutput.write("tipoEstadia");
        csvOutput.write("balneario");
        csvOutput.write("ubicacion");
        csvOutput.write("alquilerMensual");
        csvOutput.write("alquilerSemanal");
        csvOutput.write("alquilerDia");
        csvOutput.write("alquilerSemanaSanta");
        csvOutput.write("alquilerAnioNuevo");
        csvOutput.write("areaOriginal");
        csvOutput.write("areaConstruidaOriginal");
        csvOutput.write("unidadMedidaAreaTerreno");
        csvOutput.write("unidadMedidaAreaConstruida");
        csvOutput.write("precio");
        csvOutput.write("monedaSimbolo");
        csvOutput.write("fecha");
        csvOutput.write("estadoPublicacion");
        csvOutput.write("pais");
        csvOutput.write("departamento");
       

        csvOutput.endRecord();

        for (int j = 0; j < 100000; j++) {

           

                csvOutput.write(j + "");
                csvOutput.write(subCategoria[j]);
                csvOutput.write(dormitorios[j]);
                csvOutput.write(baños[j]);
                csvOutput.write(area_Total[j]);
                csvOutput.write(antiguedad[j]);
                csvOutput.write(area_Construida[j]);
                csvOutput.write(kilometro[j]);
                csvOutput.write(medio_Baño[j]);
                csvOutput.write(camas[j]);
                csvOutput.write(cochera[j]);
                csvOutput.write(fila[j]);
                csvOutput.write(tipoEstadia[j]);
                csvOutput.write(balneario[j]);
                csvOutput.write(ubicacion[j]);
                csvOutput.write(alquilerMensual[j]);
                csvOutput.write(alquilerSemanal[j]);
                csvOutput.write(alquilerDia[j]);
                csvOutput.write(alquilerSemanaSanta[j]);
                csvOutput.write(alquilerAnioNuevo[j] + "");
                csvOutput.write(areaOriginal[j]);
                csvOutput.write(areaConstruidaOriginal[j]);
                csvOutput.write(unidadMedidaAreaTerreno[j]);
                csvOutput.write(unidadMedidaAreaConstruida[j]);
                csvOutput.write(precio[j]+"");
                csvOutput.write(monedaSimbolo[j]+"");
                csvOutput.write(fecha[j]+"");
                csvOutput.write(estadoPublicacion[j]+"");
                csvOutput.write(pais[j]+"");
                csvOutput.write(departamento[j]+"");
                

                csvOutput.endRecord();

         

        }

        csvOutput.close();

    }

}
