
import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws SQLException {
        deleteData();
        insertData();
        updateData();
        readData();

    }

    public static void readData() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String userName = "devuser";
        String password = "root";

        Connection con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from students");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " ," + rs.getString(2) + " ," + rs.getString(3) + " ," + rs.getString(4) + " ," + rs.getString(5));
        }

        rs.close();
        st.close();
        con.close();
    }

    public static void insertData() throws SQLException {
        int id = 5;
        String name = "Hari V";
        String dep = "IT";
        String mail = "hari@gmail.com";
        String phone = "1234567890";
        String query = "insert into students values(?,?,?,?,?)";

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "devuser", "root");
//		Statement st = con.createStatement();
//		int row = st.executeUpdate(query);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, dep);
        pst.setString(4, mail);
        pst.setString(5, phone);
        int row = pst.executeUpdate();

        if (row > 0) {
            System.out.println("Record Inserted Successfully!");
        } else {
            System.out.println("Record Not Inserted!");
        }
        pst.close();
        con.close();
    }

    public static void deleteData() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "devuser", "root");
        String query = "DELETE FROM students WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, 5);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Record Deleted Successfully!");
        } else {
            System.out.println("No Record Found!");
        }

        pst.close();
        con.close();
    }

    public static void updateData() throws SQLException {
        String query = "UPDATE students SET department = ? WHERE id = ?";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "devuser", "root");
        PreparedStatement pst = con.prepareStatement(query);
//		pst.setString(1, "department");
        pst.setString(1, "AI");
        pst.setInt(2, 1);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Record Updated Successfully!");
        } else {
            System.out.println("No Record Found!");
        }

        pst.close();
        con.close();
    }

}
