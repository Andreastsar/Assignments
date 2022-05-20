import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MusicApp {

    public static void main(String[] args) throws SQLException {

        // Πρωτόκολλο --> jdbc:mysql για συνδεση με MySQL
        // Μετα το ονομα του σχηματος --> mymusic στο DB
        String url = "jdbc:mysql://localhost:3306/mymusic";  // localhost για το μηχανημα μας, αλλιως Ip του server, η τη διευθυνση του αλλου μηχανηματος
        String user = "root";
        String password = "Andretsa8779";

        // B.1 -- ΠΑΡΕ CONNECTION ΑΠΟ ΤΟΝ DRIVER MANAGER
        Connection con = DriverManager.getConnection(url,user,password);
        // B.2 -- CHECK CONNECTION (NOT NULL)
        System.out.println(con);
        // B.3 -- ΦΤΙΑΞΕ STATEMENT ΑΠΟ ΤΟ CONNECTION
        Statement state1 = con.createStatement();
        state1.executeQuery("Select * from songs"); // Αυτο επιστρεφει ενα RESULT SET
    }
}
