/*
 * Universidad Mariano Galvez de Guatemala
 * Programador Bryan Hernandez
 * Carne: 1990-17-42-95
 * Centro Universitario Chimaltenango
 * Descripcion del Programa "Sistema de ventas"
 * Chimaltenango 02 de Septiembre 2023
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ediso
 */
public class Conexion {

    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas", "root", "123456789");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
