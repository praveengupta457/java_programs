import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // Set response content type
    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
    out.println("<html><body>");

    try {
      // Establish database connection
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");

      // Create SQL statement and execute query
      Statement stmt = conn.createStatement();
      String sql = "SELECT * FROM employee";
      ResultSet rs = stmt.executeQuery(sql);

      // Display query results in HTML table
      out.println("<table>");
      out.println("<tr><th>Emp ID</th><th>Age</th><th>First Name</th><th>Last Name</th></tr>");
      while (rs.next()) {
        int empId = rs.getInt("empId");
        int age = rs.getInt("Age");
        String firstName = rs.getString("Firstname");
        String lastName = rs.getString("LastName");
        out.println("<tr><td>" + empId + "</td><td>" + age + "</td><td>" + firstName + "</td><td>" + lastName + "</td></tr>");
      }
      out.println("</table>");

      // Close database connection
      rs.close();
      stmt.close();
      conn.close();
    } catch (Exception e) {
      out.println("<p>Exception encountered: " + e.getMessage() + "</p>");
    }

    out.println("</body></html>");
  }
}
