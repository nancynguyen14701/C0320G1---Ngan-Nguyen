package P3LopDoiTuongTrongJava.BaiTap.StopWatch;

import java.util.Date;

public class StopWatch {
    static Date time= new Date();

    private Date startTime, endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public StopWatch() {
        //this.startTime= time();
    }
    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
