package Class_Stopwatch;

import java.time.LocalDateTime;

public class Stopwatch {
    private LocalDateTime startTime, endTime;
    public Stopwatch() {
        startTime = LocalDateTime.now();
    }
    public void start() {
        startTime = LocalDateTime.now();
    }
    public void end() {
        endTime = LocalDateTime.now();
    }
    public long getElapsedTime() {
        return -((startTime.getHour()-endTime.getHour())*3600+(startTime.getMinute()-endTime.getMinute())*60+(startTime.getSecond()-endTime.getSecond()))*1000;
    }
}
