package sqlite_conexion;
/**
*  @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class Main {

    public static void main(String[] args) {
         //Se crea instancia a objeto y se conecta a SQLite
        SQLite_conexion fbc = new SQLite_conexion();
        //Se insertan algunos datos
        fbc.insert("persona", " nombre, apellido ", " 'Charly', 'Manson' ");
        fbc.insert("persona", " nombre, apellido ", " 'Marilyn' , 'Garcia' ");
        fbc.insert("persona", " nombre, apellido ", " 'Marcelo', 'Chamboneti' ");
        fbc.insert("persona", " nombre, apellido ", " 'Jorge', 'Valencia' ");
        //Se imprimen los datos de la tabla
        System.out.println( fbc.select() );
        fbc.desconectar();
    }

}
