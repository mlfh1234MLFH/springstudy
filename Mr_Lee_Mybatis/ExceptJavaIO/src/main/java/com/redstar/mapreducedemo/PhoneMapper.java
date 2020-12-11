package com.redstar.mapreducedemo;

import com.redstar.entry.Phone;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/9/3 14:46
 * @Description:
 * @Content:
 */
public class PhoneMapper extends Mapper<LongWritable,Text, Text, Phone> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] values = value.toString().split("\t");
        String phoneNumber = values[1];
        long upFlow = Long.parseLong(values[5]);
        long lowFlow = Long.parseLong(values[6]);

        context.write(new Text(phoneNumber),new Phone(upFlow,lowFlow));

    }
}
