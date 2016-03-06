package presentation.collections;

public interface QueryHistory {
    int QUERY_BUFFER_COUNT = 20;

    String getNextQuery();

    String getPreviousQuery();

    void addQueryToTheHead(String query);
}
