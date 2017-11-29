/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Consultas {

    String sql;
    String[] dormitorios, baños, area_Total, antiguedad, area_Construida, kilometro, medio_Baño, camas,
            cochera, fila, tipoEstadia, balneario, ubicacion, alquilerMensual, alquilerSemanal, alquilerDia, alquilerSemanaSanta, alquilerAnioNuevo, areaOriginal, areaConstruidaOriginal, unidadMedidaAreaTerreno,
            unidadMedidaAreaConstruida;
    String[] subCategoria, monedaSimbolo, fecha, estadoPublicacion, pais, departamento;

    float[] precio;

    public Consultas() {

        dormitorios = new String[100000];
        baños = new String[100000];
        area_Total = new String[100000];
        antiguedad = new String[100000];
        area_Construida = new String[100000];
        kilometro = new String[100000];
        medio_Baño = new String[100000];
        camas = new String[100000];
        cochera = new String[100000];
        fila = new String[100000];
        tipoEstadia = new String[100000];
        balneario = new String[100000];
        ubicacion = new String[100000];
        alquilerMensual = new String[100000];
        alquilerSemanal = new String[100000];
        alquilerDia = new String[100000];

        alquilerSemanaSanta = new String[100000];
        alquilerAnioNuevo = new String[100000];
        areaOriginal = new String[100000];
        areaConstruidaOriginal = new String[100000];
        unidadMedidaAreaTerreno = new String[100000];
        unidadMedidaAreaConstruida = new String[100000];

        //****************************//
        subCategoria = new String[100000];
        monedaSimbolo = new String[100000];
        fecha = new String[100000];
        precio = new float[100000];
        estadoPublicacion = new String[100000];
        pais = new String[100000];
        departamento = new String[100000];

    }

    public void iniciar() {

        for (int i = 0; i < 100000; i++) {

            dormitorios[i] = "";
            baños[i] = "";
            area_Total[i] = "";
            antiguedad[i] = "";
            area_Construida[i] = "";
            kilometro[i] = "";
            medio_Baño[i] = "";
            camas[i] = "";
            cochera[i] = "";
            fila[i] = "";
            tipoEstadia[i] = "";
            balneario[i] = "";
            ubicacion[i] = "";
            alquilerMensual[i] = "";
            alquilerSemanal[i] = "";
            alquilerDia[i] = "";

            alquilerSemanaSanta[i] = "";
            alquilerAnioNuevo[i] = "";
            areaOriginal[i] = "";
            areaConstruidaOriginal[i] = "";
            unidadMedidaAreaTerreno[i] = "";
            unidadMedidaAreaConstruida[i] = "";

            //***************//
            subCategoria[i] = "";
            monedaSimbolo[i] = "";
            fecha[i] = "";
            precio[i] = 0.0f;
            estadoPublicacion[i] = "";
            pais[i] = "";
            departamento[i] = "";

        }

    }

    public void completarCaracteristicas() throws SQLException {

        Conexion objCon = new Conexion();

        objCon.conectar();

        sql = "select id,idAviso,idCaracteristica,valor from mod_aviso_caracteristicas_x_aviso where idCaracteristica>=19 and idCaracteristica<=34";

        PreparedStatement stm = objCon.getCon().prepareStatement(sql);

        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            /**
             * System.out.println(rs.getString("id")+ ","
             * +rs.getString("idAviso") + "," + rs.getString("idCaracteristica")
             * + "," + rs.getString("valor"));
             */
            String idCaracteristica = rs.getString("idCaracteristica");
            int id = Integer.parseInt(rs.getString("idAviso"));

            if (idCaracteristica.equalsIgnoreCase("1")) {

                dormitorios[id] = rs.getString("valor");

            } else if (idCaracteristica.equalsIgnoreCase("2")) {
                baños[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("3")) {
                area_Total[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("4")) {
                antiguedad[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("5")) {
                area_Construida[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("6")) {
                kilometro[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("7")) {
                medio_Baño[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("8")) {
                camas[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("9")) {
                cochera[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("10")) {
                fila[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("11")) {
                tipoEstadia[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("12")) {
                balneario[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("13")) {
                ubicacion[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("14")) {
                alquilerMensual[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("15")) {
                alquilerSemanal[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("16")) {
                alquilerDia[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("17")) {
                alquilerSemanaSanta[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("18")) {
                alquilerAnioNuevo[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("41")) {
                areaOriginal[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("42")) {
                areaConstruidaOriginal[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("43")) {
                unidadMedidaAreaTerreno[id] = rs.getString("valor");
            } else if (idCaracteristica.equalsIgnoreCase("44")) {
                unidadMedidaAreaConstruida[id] = rs.getString("valor");
            }

        }

        objCon.desconectar();

    }

    public void completarPrecios() throws SQLException {

        Conexion objCon = new Conexion();

        objCon.conectar();

        sql = "select id,idSubcategoria,precio,moneda_simbolo,fchPublicacion,estado,idPais,idDpto from db_todobusco_prod.mod_aviso_aviso where idCategoria=1";

        PreparedStatement stm = objCon.getCon().prepareStatement(sql);

        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            /**
             * System.out.println(rs.getInt("id")+ ","
             * +rs.getInt("idSubcategoria") + "," + rs.getFloat("precio") + ","
             * + rs.getString("moneda_simbolo") + "," +
             * rs.getString("fchPublicacion"));
             */
            int idAviso = rs.getInt("id");
            int idSubcategoria = rs.getInt("idSubcategoria");
            int estadoP = rs.getInt("estado");

            if (idSubcategoria == 1) {
                subCategoria[idAviso] = "Apartamentos";
            } else if (idSubcategoria == 2) {
                subCategoria[idAviso] = "Casas";
            } else if (idSubcategoria == 3) {
                subCategoria[idAviso] = "Casas de Playa";
            } else if (idSubcategoria == 4) {
                subCategoria[idAviso] = "Edificios";
            } else if (idSubcategoria == 5) {
                subCategoria[idAviso] = "Fincas";
            } else if (idSubcategoria == 6) {
                subCategoria[idAviso] = "Locales Comerciales";
            } else if (idSubcategoria == 7) {
                subCategoria[idAviso] = "Negocios";
            } else if (idSubcategoria == 8) {
                subCategoria[idAviso] = "Oficinas";
            } else if (idSubcategoria == 9) {
                subCategoria[idAviso] = "Propiedades Islas";
            } else if (idSubcategoria == 10) {
                subCategoria[idAviso] = "Terrenos";
            } else {

                subCategoria[idAviso] = "No Definido";
            }

            if (estadoP == 0) {
                estadoPublicacion[idAviso] = "Despublicado";
            } else if (estadoP == 1) {
                estadoPublicacion[idAviso] = "Publicado";
            } else if (estadoP == 2) {
                estadoPublicacion[idAviso] = "Caducado";
            } else if (estadoP == 3) {
                estadoPublicacion[idAviso] = "Eliminado";
            } else if (estadoP == 4) {
                estadoPublicacion[idAviso] = "Pendiente de Pago";
            } else if (estadoP == 5) {
                estadoPublicacion[idAviso] = "Moderado";
            } else if (estadoP == 6) {
                estadoPublicacion[idAviso] = "De Baja";
            } else if (estadoP == 7) {
                estadoPublicacion[idAviso] = "Vendido";
            } else if (estadoP == 8) {
                estadoPublicacion[idAviso] = "Pendiente de Publicacion";
            } else {
                estadoPublicacion[idAviso] = "No Definido";
            }

            precio[idAviso] = rs.getFloat("precio");
            monedaSimbolo[idAviso] = rs.getString("moneda_simbolo");

            String fechita = "";
            if (rs.getString("fchPublicacion") != null) {

                fechita = rs.getString("fchPublicacion").substring(0, 10);

                System.out.println("" + fechita + "*******************");

            } else {

                fechita = "1900-01-01";

            }

            fecha[idAviso] = fechita;

            String paises = "";

            if (rs.getInt("idPais") == 1) {

                paises = "Nicaragua";

            } else if (rs.getInt("idPais") == 38) {

                paises = "Costa Rica";

            } else {

                paises = "No definido";

            }

            String departamentos = "";

            if (rs.getInt("idDpto") == 1) {

                departamentos = "Carazao";

            } else if (rs.getInt("idDpto") == 2) {

                departamentos = "Chinandega";

            } else if (rs.getInt("idDpto") == 3) {

                departamentos = "Granada";

            } else if (rs.getInt("idDpto") == 4) {

                departamentos = "Leon";

            } else if (rs.getInt("idDpto") == 5) {

                departamentos = "Managua";

            } else if (rs.getInt("idDpto") == 6) {

                departamentos = "Masaya";

            } else if (rs.getInt("idDpto") == 7) {

                departamentos = "Rivas";

            } else if (rs.getInt("idDpto") == 8) {

                departamentos = "Boaco";

            } else if (rs.getInt("idDpto") == 9) {

                departamentos = "Chontales";

            } else if (rs.getInt("idDpto") == 10) {

                departamentos = "Esteli";

            } else if (rs.getInt("idDpto") == 11) {

                departamentos = "Jinotega";

            } else if (rs.getInt("idDpto") == 12) {

                departamentos = "Madriz";

            } else if (rs.getInt("idDpto") == 13) {

                departamentos = "Matagalpa";

            } else if (rs.getInt("idDpto") == 14) {

                departamentos = "Nueva Segobia";

            } else if (rs.getInt("idDpto") == 15) {

                departamentos = "Rio San Juan";

            } else if (rs.getInt("idDpto") == 16) {

                departamentos = "Caribe Norte";

            } else if (rs.getInt("idDpto") == 17) {

                departamentos = "Caribe Sur";

            } else if (rs.getInt("idDpto") == 18) {

                departamentos = "Alajuela";

            } else if (rs.getInt("idDpto") == 19) {

                departamentos = "Cartago";

            } else if (rs.getInt("idDpto") == 20) {

                departamentos = "Guanacaste";

            } else if (rs.getInt("idDpto") == 21) {

                departamentos = "Heredia";

            } else if (rs.getInt("idDpto") == 22) {

                departamentos = "Limon";

            } else if (rs.getInt("idDpto") == 23) {

                departamentos = "Puntarenas";

            } else if (rs.getInt("idDpto") == 24) {

                departamentos = "San Jose";

            } else {

                departamentos = "No Definido";

            }

            pais[idAviso] = paises;
            departamento[idAviso] = departamentos;

        }
        /**
         * for (int i = 0; i < 100000; i++) {
         *
         * if (subCategoria[i].equalsIgnoreCase("")) {
         *
         * }else{
         * System.out.println(i+","+subCategoria[i]+","+precio[i]+","+monedaSimbolo[i]+","+fecha[i]
         * );
         *
         * }
         *
         * }
         *
         */

        objCon.desconectar();
    }

    public void mostrarTotales() {

        System.out.println("//**********INICIO************//");

        for (int i = 0; i < 100000; i++) {

            System.out.println(i + "," + subCategoria[i]
                    + "," + antiguedad[i] + "," + area_Construida[i] + "," + kilometro[i] + "," + area_Total[i] + "," + alquilerSemanal[i]
                    + "," + medio_Baño[i] + "," + dormitorios[i] + "," + baños[i] + "," + alquilerDia[i]
                    + "," + camas[i] + "," + cochera[i] + "," + fila[i] + "," + tipoEstadia[i] + ","
                    + balneario[i] + "," + ubicacion[i] + "," + alquilerMensual[i]
                    + "," + precio[i] + "," + monedaSimbolo[i] + "," + fecha[i]
            );

        }

    }

    public void mostrarVehiculos() {

        System.out.println("id;subCategoria;marca;modelo;anio;estado;color"
                + ";combustible;kilometraje;motor;asientos"
                + ";transmision;timon;traccion;estilo"
                + ";cilindros;trenManejo;chasis"
                + ";precio;monedaSimbolo;fecha;estadoPublicacion");

        for (int i = 0; i < 100000; i++) {

            if (subCategoria[i].equalsIgnoreCase("")) {

            } else {

                System.out.println(i + ";" + subCategoria[i]
                        + ";" + antiguedad[i] + ";" + area_Construida[i] + ";" + kilometro[i] + ";" + area_Total[i] + ";" + alquilerSemanal[i]
                        + ";" + medio_Baño[i] + ";" + dormitorios[i] + ";" + baños[i] + ";" + alquilerDia[i]
                        + ";" + camas[i] + ";" + cochera[i] + ";" + fila[i] + ";" + tipoEstadia[i] + ";"
                        + balneario[i] + ";" + ubicacion[i] + ";" + alquilerMensual[i]
                        + ";" + precio[i] + ";" + monedaSimbolo[i] + ";" + fecha[i] + ";" + estadoPublicacion[i]
                        + ";" + pais[i] + ";" + departamento[i]
                );

            }

        }

    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String[] getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(String[] dormitorios) {
        this.dormitorios = dormitorios;
    }

    public String[] getBaños() {
        return baños;
    }

    public void setBaños(String[] baños) {
        this.baños = baños;
    }

    public String[] getArea_Total() {
        return area_Total;
    }

    public void setArea_Total(String[] area_Total) {
        this.area_Total = area_Total;
    }

    public String[] getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String[] antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String[] getArea_Construida() {
        return area_Construida;
    }

    public void setArea_Construida(String[] area_Construida) {
        this.area_Construida = area_Construida;
    }

    public String[] getKilometro() {
        return kilometro;
    }

    public void setKilometro(String[] kilometro) {
        this.kilometro = kilometro;
    }

    public String[] getMedio_Baño() {
        return medio_Baño;
    }

    public void setMedio_Baño(String[] medio_Baño) {
        this.medio_Baño = medio_Baño;
    }

    public String[] getCamas() {
        return camas;
    }

    public void setCamas(String[] camas) {
        this.camas = camas;
    }

    public String[] getCochera() {
        return cochera;
    }

    public void setCochera(String[] cochera) {
        this.cochera = cochera;
    }

    public String[] getFila() {
        return fila;
    }

    public void setFila(String[] fila) {
        this.fila = fila;
    }

    public String[] getTipoEstadia() {
        return tipoEstadia;
    }

    public void setTipoEstadia(String[] tipoEstadia) {
        this.tipoEstadia = tipoEstadia;
    }

    public String[] getBalneario() {
        return balneario;
    }

    public void setBalneario(String[] balneario) {
        this.balneario = balneario;
    }

    public String[] getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String[] ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String[] getAlquilerMensual() {
        return alquilerMensual;
    }

    public void setAlquilerMensual(String[] alquilerMensual) {
        this.alquilerMensual = alquilerMensual;
    }

    public String[] getAlquilerSemanal() {
        return alquilerSemanal;
    }

    public void setAlquilerSemanal(String[] alquilerSemanal) {
        this.alquilerSemanal = alquilerSemanal;
    }

    public String[] getAlquilerDia() {
        return alquilerDia;
    }

    public void setAlquilerDia(String[] alquilerDia) {
        this.alquilerDia = alquilerDia;
    }

    public String[] getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String[] subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String[] getMonedaSimbolo() {
        return monedaSimbolo;
    }

    public void setMonedaSimbolo(String[] monedaSimbolo) {
        this.monedaSimbolo = monedaSimbolo;
    }

    public String[] getFecha() {
        return fecha;
    }

    public void setFecha(String[] fecha) {
        this.fecha = fecha;
    }

    public String[] getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(String[] estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }

    public float[] getPrecio() {
        return precio;
    }

    public void setPrecio(float[] precio) {
        this.precio = precio;
    }

    public String[] getPais() {
        return pais;
    }

    public void setPais(String[] pais) {
        this.pais = pais;
    }

    public String[] getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String[] departamento) {
        this.departamento = departamento;
    }

}
