/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author alexandermunguiaclemente
 */
public class ModeloGestionBBDD {

    /*private Connection conexion;

    public ModeloGestionBBDD() {
        conexion = null;
    }

    /**
     * Realiza una carga de datos inicial
     */
   /* public void insertarDatosIniciales() {
        //COCHES
        String[] nombreCoche = {"Ferrari", "Red Bull", "Renault", "Toro Rosso", "McLaren Honda"};
        int[] gananciaCurva = {1, 2, 1, 2, 1, 2, 1, 1, 2};
        //CIRCUITOS
        String[] nombreCircuito = {"MELBOURNE", "SAKHIR", "SHANGAI", "MONTECARLO"};
        String[] ciudad = {"Melbourne", "Sakhir", "Shangai", "Montecarlo"};
        String[] pais = {"Australia", "Bahrein", "China", "Moncano"};
        int[] numeroVueltas = {54, 72, 61, 82};
        int[] longitud = {5920, 4200, 4300, 4400};
        int[] numeroCurvas = {20, 32, 52, 15};

        for (int i = 0; i < 4; i++) {
            insertarDatosCoche(new Coche(nombreCoche[i], gananciaCurva[i]));
            insertarDatosCircuito(new Circuito(nombreCircuito[i], ciudad[i], pais[i], numeroVueltas[i], longitud[i], numeroCurvas[i]));
        }
    }

    //Conexion base de datos
    public void establecerConexion() {
        try {
            String driver = "org.apache.derby.jdbc.EmbeddedDriver";
            String dbRuta = "/DerbyDB/F1DB";
            String dbExistente = "create=true"; //Si la base de datos no está creada, se crea una nueva
            String urlConexion = "jdbc:derby:" + dbRuta + ";" + dbExistente;

            Class.forName(driver);
            conexion = DriverManager.getConnection(urlConexion);

        } catch (SQLException | ClassNotFoundException ex) {
        }
    }
    
    // Crear base de datos nueva
    public void crearBaseDatos() {
        try {
            Statement st = conexion.createStatement();
            String crearTablaCircuitos = "CREATE TABLE Circuitos ("
                    + "nombre_circuito VARCHAR(20) NOT NULL CONSTRAINT circuitos_PK PRIMARY KEY,"
                    + "ciudad VARCHAR(15) NOT NULL,"
                    + "pais VARCHAR(15) NOT NULL,"
                    + "numero_vueltas INTEGER NOT NULL,"
                    + "longitud INTEGER NOT NULL,"
                    + "numero_curvas INTEGER NOT NULL"
                    + ")";
            String crearTablaCoches = "CREATE TABLE Coches ("
                    + "nombre_coche VARCHAR(20) NOT NULL CONSTRAINT coches_PK PRIMARY KEY,"
                    + "ganancia_curva INTEGER NOT NULL"
                    + ")";

            st.execute(crearTablaCircuitos);
            st.execute(crearTablaCoches);
            st.close();
        } catch (SQLException ex) {
        }
    }

    //Cerramos la conexion a la BBDD
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
        }
    }*/

    /**
     * Insertar registros 
     *
     * @param circuito
     */
 /*   public void insertarDatosCircuito(Circuito circuito) {

        try {
            PreparedStatement pstmnt;
            String nuevoRegistro = "INSERT INTO Circuitos VALUES (?, ?, ?, ?, ?, ?)";

            pstmnt = conexion.prepareStatement(nuevoRegistro);
            pstmnt.setString(1, circuito.getNombreCircuito());
            pstmnt.setString(2, circuito.getCiudad());
            pstmnt.setString(3, circuito.getPais());
            pstmnt.setInt(4, circuito.getNumeroVueltas());
            pstmnt.setInt(5, circuito.getLongitudVuelta());
            pstmnt.setInt(6, circuito.getNumeroCurvas());

            pstmnt.execute();//Ejecutamos consulta
            pstmnt.close();
        } catch (SQLException e) {
        }
    }

    /**
     * Inserta registros en la tabla Coches
     *
     * @param coche
     */
  /*  public void insertarDatosCoche(Coche coche) {
        try {
            PreparedStatement pstmnt;
            String nuevoRegistro = "INSERT INTO Coches VALUES (?, ?)";

            pstmnt = conexion.prepareStatement(nuevoRegistro);
            pstmnt.setString(1, coche.getNombreCoche());
            pstmnt.setInt(2, coche.getGananciaPotenciaCurva());
            pstmnt.execute();//Ejecutamos consulta
            pstmnt.close();
        } catch (SQLException e) {
        }
    }
*/

    /**
     * Mostramos los datos de la tabla circuito
     *
     * @return
     */
   /* public HashMap<String, Circuito> obtenerTodosCircuitos() {
        HashMap<String, Circuito> hashCircuitos = new HashMap();

        try {
            Statement st = conexion.createStatement();
            String consulta = "SELECT * FROM Circuitos";
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {
                hashCircuitos.put(rs.getString("nombre_circuito"), new Circuito(rs.getString("nombre_circuito"),
                        rs.getString("ciudad"),
                        rs.getString("pais"),
                        rs.getInt("numero_vueltas"),
                        rs.getInt("longitud"),
                        rs.getInt("numero_curvas")));
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
        }
        return hashCircuitos;
    }*/

    /**
     *Mostramos contenido de la tabla Coche 
     *
     * @return
     */
   /* public HashMap<String, Coche> obtenerTodosCoches() {
        HashMap<String, Coche> hashCoches = new HashMap();

        try {
            Statement st = conexion.createStatement();
            String consulta = "SELECT * FROM Coches";
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {
                hashCoches.put(rs.getString("nombre_coche"),
                        new Coche(rs.getString("nombre_coche"),
                                rs.getInt("ganancia_curva")));
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
        }
        return hashCoches;
    }*/
}

