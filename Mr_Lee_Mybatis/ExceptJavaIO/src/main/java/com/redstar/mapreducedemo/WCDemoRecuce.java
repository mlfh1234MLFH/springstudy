package com.redstar.mapreducedemo;

import org.apache.hadoop.examples.SecondarySort;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/9/1 14:22
 * @Description:
 * @Content:
 */
public class WCDemoRecuce extends Reducer<Text,IntWritable,Text, IntWritable> {

   int count = 0;

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        Iterator<IntWritable> iterator = values.iterator();
        while (iterator.hasNext()){
            count += iterator.next().get();
        }
        context.write(key,new IntWritable(count));
    }
}
