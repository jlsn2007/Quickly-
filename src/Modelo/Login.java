package Modelo;

import java.sql.*;
import java.util.UUID;

public class Login {
    
    String UUID_Usuario;
    String nombre;
    String correo_electronico;
    String contraseña;
    
    //Llaves foraneas
    int id_grado;
    int id_rol;
    int id_comite;

    public String getUUID_Usuario() {
        return UUID_Usuario;
    }

    public void setUUID_Usuario(String UUID_Usuario) {
        this.UUID_Usuario = UUID_Usuario;
    }

    public int getId_grado() {
        return id_grado;
    }

    public void setId_grado(int id_grado) {
        this.id_grado = id_grado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_comite() {
        return id_comite;
    }

    public void setId_comite(int id_comite) {
        this.id_comite = id_comite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void GuardarUsuario(){
        
        Connection conexion = ClaseConexion.getConexion();
        
        try {
            
            PreparedStatement newUs = conexion.prepareStatement ("Insert into Usuario (UUID, nombre, id_grado, id_rol, id_comite, contraseña, correo_electronico) Values (?, ?, ?, ?, ?, ?, ?)");
            
            newUs.setString (1, UUID.randomUUID().toString());
            newUs.setString (2, getNombre());
            newUs.setInt (3, getId_grado());
            newUs.setInt (4, getId_rol());
            newUs.setInt (5, getId_comite());
            newUs.setString (6, getContraseña());
            newUs.setString (7, getCorreo_electronico());
            
            newUs.executeUpdate();

        } 
        
        catch (SQLException ex) {
            System.out.println("este es el error en el modelo: metodo guardar " + ex) ;
        }
                
    }
    
    public boolean Login(){
        
        Connection conexion = ClaseConexion.getConexion();
        boolean resultado = false;
        
        try {
          
            String sql = "Select * from Usuario WHERE correo_electronico = ? AND cotraseña = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1,getCorreo_electronico());
            statement.setString(2,getContraseña());
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                resultado = true;
            }

        } 
        
        catch (Exception ex) {
            System.out.println("Error en el modélo: En el método Iniciar sesión ha ocurrido: " + ex);
        }
        
        return resultado;
    }
}
