import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBMSQuiz {
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";
    private static final String QUERY = "SELECT name, age, address FROM students WHERE age >= 30 AND age < 40";

    public static void main(String[] args) {

        // 객체 자원 닫기
        try (   // 자원을 자동으로 해제하기 위해서 try-with-resource 사용
                 Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                // 2. SQL문 실행을 휘한 PreparedStatement 객체 생성
                PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
                // 3. sql 쿼리 실행
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            // 4. 결과
            System.out.println("==================");
            System.out.println("실행 결과 출력 ");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");
                System.out.println(name + " " + age + "  " + address);
            }
        } catch (SQLException e) {
            System.out.println("연결 실패");
            throw new RuntimeException(e);
        }
    }
}
