import java.sql.*;

public class TransactionHandlinginJDBC{
    static final String URL = "jdbc:mysql://localhost:3306/bank";
    static final String USER = "root";
    static final String PASS = "";

    public static void transfer(int fromId, int toId, double amount) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            con.setAutoCommit(false);

            try (PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                // Debit from sender
                debit.setDouble(1, amount);
                debit.setInt(2, fromId);
                debit.executeUpdate();

                // Credit to receiver
                credit.setDouble(1, amount);
                credit.setInt(2, toId);
                credit.executeUpdate();

                con.commit();
                System.out.println("Transfer successful.");
            } catch (Exception e) {
                con.rollback();
                System.out.println("Transfer failed. Rolled back.");
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        transfer(1, 2, 500); // Transfer ₹500 from account 1 to 2
    }
}
