package presentation.oop;

public class PolymorphizmDemo {
    public static void main(String[] args) {
        JdbcExecutor jdbcExecutor = new MockJdbcExecutor();
        jdbcExecutor.executeScript("select * from void");
    }
}
