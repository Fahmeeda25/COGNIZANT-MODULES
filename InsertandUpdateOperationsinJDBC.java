import java.sql.*;
public class InsertandUpdateOperationsinJDBC{
    private final String url = "jdbc:mysql://localhost:3306/school";
    private final String user = "root";
    private final String password = "";
    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, password);
    }
    public void insertStudent(int id, String name, int age) {
        String sql = "INSERT INTO students VALUES (?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id); ps.setString(2, name); ps.setInt(3, age);
            ps.executeUpdate();
            System.out.println("Inserted.");
        } catch (Exception e) { e.printStackTrace(); }
    }
    public void updateStudent(int id, int age) {
        String sql = "UPDATE students SET age=? WHERE id=?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, age); ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Updated.");
        } catch (Exception e) { e.printStackTrace(); }
    }
}

