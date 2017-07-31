package test.spring.service;

import com.sun.management.OperatingSystemMXBean;
import org.springframework.stereotype.Component;

import java.lang.management.ManagementFactory;

@Component
public class AppState {
    private double procCpuUsage;
    private long procMemoryUsage;
    private long startTime = System.currentTimeMillis();
    private long procUptime;
    private String devName;

    OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

    private double getProcCpuUsage(){
        return (int)(operatingSystemMXBean.getProcessCpuLoad() * 10000) / 100D;
    }

    private long getMemoryUsage(){
        return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024;
    }

    private long getProcUptime(){
        return (System.currentTimeMillis() - startTime) / 1000;
    }

    private String getDevName(){
        return System.getProperty("developer");
    }

    public AppState getState(){
        procCpuUsage = getProcCpuUsage();
        procMemoryUsage = getMemoryUsage();
        procUptime = getProcUptime();
        devName = getDevName();
        return this;
    }

    @Override
    public String toString() {
        return "AppState{" +
                "procCpuUsage: " + procCpuUsage + "%" +
                ", procMemoryUsage: " + procMemoryUsage + "Mb" +
                ", procUptime: " + procUptime + " c" +
                ", devName: " + devName +
                '}';
    }
}
