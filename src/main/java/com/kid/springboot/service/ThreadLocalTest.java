package com.kid.springboot.service;

/**
 * Created by Administrator on 2017/6/15.
 */


import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Android Looper
 * Created by Liu on 2017/5/24.
 */
public class ThreadLocalTest {
    static class ThreadLocalVariableHolder {
        private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
            private Random random = new Random();
            protected Integer initialValue() {
                return 1;
            }
        };

        public static void increment() {
            value.set(value.get() + 1);
        }

        public static int get() {
            return value.get();
        }
    }

    static class Accessor implements Runnable {
        private final int id;

        public Accessor(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if(ThreadLocalVariableHolder.value.get()==1){
                    ThreadLocalVariableHolder.increment();
                    System.out.println(this);
                }
                Thread.yield();
            }
        }

        @Override
        public String toString() {
            return "#" + id + ": " + ThreadLocalVariableHolder.get();
        }

    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 500; i++) {
            executorService.execute(new Accessor(i));
        }
        try {
            TimeUnit.MICROSECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdownNow();

        String s = "A876X";
// 把要匹配的字符串写成正则表达式，然后要提取的字符使用括号括起来
// 在这里，我们要提取最后一个数字，正则规则就是“一个数字加上大于等于0个非数字再加上结束符”
        Pattern pattern = Pattern.compile("(\\d)[^\\d]$");
        Matcher matcher = pattern.matcher(s);
        if(matcher.find())
            System.out.println(matcher.group(1));
    }

}
