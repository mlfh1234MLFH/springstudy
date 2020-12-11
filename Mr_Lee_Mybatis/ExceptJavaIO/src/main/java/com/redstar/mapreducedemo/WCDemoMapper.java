package com.redstar.mapreducedemo;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/9/1 13:51
 * @Description:
 * @Content:
 */
public class WCDemoMapper extends Mapper<LongWritable,Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] values = value.toString().split("\t");
        for(String wordcount:values){
            context.write(new Text(wordcount),new IntWritable(1));
        }
    }
}
