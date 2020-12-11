package com.redstar.entry;


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/9/3 14:49
 * @Description:
 * @Content:
 */
public class Phone {
    private Long upFlow;
    private Long lowFlow;
    private Long sumFlow;

    public Phone(){}

    public Phone(Long upFlow, Long lowFlow) {
        this.upFlow = upFlow;
        this.lowFlow = lowFlow;
        this.sumFlow = upFlow = lowFlow;
    }

    public Long getSumFlow() {
        return sumFlow;
    }

    public void setSumFlow(Long sumFlow) {
        this.sumFlow = sumFlow;
    }

    public Long getUpFlow() {
        return upFlow;
    }

    public void setUpFlow(Long upFlow) {
        this.upFlow = upFlow;
    }

    public Long getLowFlow() {
        return lowFlow;
    }

    public void setLowFlow(Long lowFlow) {
        this.lowFlow = lowFlow;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "upFlow=" + upFlow +
                ", lowFlow=" + lowFlow +
                ", sumFlow=" + sumFlow +
                '}';
    }

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(upFlow);
        dataOutput.writeLong(lowFlow);
        dataOutput.writeLong(sumFlow);
    }

    public void readFields(DataInput dataInput) throws IOException {
         upFlow = dataInput.readLong();
         lowFlow = dataInput.readLong();
         sumFlow = dataInput.readLong();
    }

    public int compareTo(Phone o) {
        return 0;
    }
}
