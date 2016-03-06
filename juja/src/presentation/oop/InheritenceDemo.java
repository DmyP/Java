package presentation.oop;

public class InheritenceDemo {

    public static void main(String[] args) {
        JdbcExecutor jdbcExecutor = new JdbcExecutor();
        jdbcExecutor.executeScript("select * from nothing");

        MockJdbcExecutor mockJdbcExecutor = new MockJdbcExecutor();
        mockJdbcExecutor.executeScript("select * from nothing");
    }
}

class JdbcExecutor {
    public void executeScript(String sql) {
        System.out.println("Pretend I am executing SQL ....." + sql);
    }
}

class MockJdbcExecutor extends JdbcExecutor {

}
