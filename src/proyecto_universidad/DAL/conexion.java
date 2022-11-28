package proyecto_universidad.DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author erick
 */
public class conexion {
    //genero en alumnos no se guarda al actualizar
    //boton horarios no dirige a nada
    //boton documentos no dirige a nada
    
    
    /*Conexión con DBFREE
    String strConexionDB = "jdbc:mysql://db4free.net:3306/universidad_proy";
    String user = "gatitolover01";
    String pass = "EquipoGl01";
    */
    //Conexion con RemoteMySQL
    String strConexionDB = "jdbc:mysql://remotemysql.com:3306/FgQKdPudUJ";
    String user = "FgQKdPudUJ";
    String pass = "ew5EoQKp3s";
    Connection conn = null;
    
    public conexion(){
        try {    
            //MySql
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            
            //MySql
            conn = (Connection)DriverManager.getConnection(strConexionDB, user, pass);
            
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Conexion erronea " + e);
        }
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){//Este metodo sirve para agregar datos a la DB
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        
        //objConexion.ejecutarSentenciaSQL("INSERT INTO `usuarios`(`Iduser`, `nickname`, `pass`, `nombre`, `email`, `tel`) VALUES (2,'user2',312654,'Meydi','laMeyz@gmail.com','9996324521')");         
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){//Este metodo obtiene datos de DB
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
        /*  ESTO IRA EN EL BOTON
        try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM usuarios");
            while(resultado.next()){
                System.out.println(resultado.getInt("Iduser"));
                System.out.println(resultado.getString("nickname"));
                System.out.println(resultado.getString("pass"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("email"));
                System.out.println(resultado.getString("tel"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }*/    
    }
}
