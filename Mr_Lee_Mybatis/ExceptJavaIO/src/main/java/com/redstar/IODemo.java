package com.redstar;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.io.*;
import java.util.*;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/8/19 15:43
 * @Description:
 * @Content:
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() {


        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\data\\upload\\aa.txt");
            byte[] by = new byte[4];
            fis.read(by);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
