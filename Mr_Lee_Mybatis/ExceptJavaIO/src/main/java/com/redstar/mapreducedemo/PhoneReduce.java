package com.redstar.mapreducedemo;

import com.redstar.entry.Phone;
import org.apache.hadoop.examples.SecondarySort;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/9/3 15:29
 * @Description:
 * @Content:
 */
public class PhoneReduce extends Reducer<Text, Phone,Text, Phone> {
    long upFlow = 0L;
    long lowFlow = 0L;
    long sum = 0L;
    @Override
    protected void reduce(Text key, Iterable<Phone> values, Context context) throws IOException, InterruptedException {
        Iterator<Phone> iterator = values.iterator();
        while (iterator.hasNext()){
            upFlow += iterator.next().getUpFlow();
            lowFlow += iterator.next().getLowFlow();
        }
        context.write(key,new Phone(upFlow,lowFlow));
    }
}
