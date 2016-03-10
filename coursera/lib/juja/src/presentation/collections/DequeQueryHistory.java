package presentation.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeQueryHistory implements QueryHistory {
    private Deque<String> nextHistory = new LinkedList<>();
    private Deque<String> previousHistory = new LinkedList<>();

    @Override
    public String getNextQuery() {
        String nextQuery = nextHistory.pollFirst();
        previousHistory.addFirst(nextQuery);
        return nextQuery;
    }

    @Override
    public String getPreviousQuery() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void addQueryToTheHead(String query) {
        if (nextHistory.size() + previousHistory.size() >= QUERY_BUFFER_COUNT) {
            nextHistory.addFirst(query);
            nextHistory.removeLast();
        }
    }
}
