package com.redstar.mapreducedemo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import javax.xml.soap.Text;


/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/9/1 14:37
 * @Description:
 * @Content:
 */
public class WCDemoDriver {
    public static void main(String[] args) throws Exception{

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        job.setJarByClass(WCDemoDriver.class);

        job.setMapperClass(WCDemoMapper.class);
        job.setReducerClass(WCDemoRecuce.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        FileInputFormat.setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        System.exit(job.waitForCompletion(true)? 0:1);
    }
}
