package week2.sorting;

public interface ArrayRecorder<T extends Comparable> extends Array<T>{
    void stop();

    void record();

    Statistic getStatistic();
}
