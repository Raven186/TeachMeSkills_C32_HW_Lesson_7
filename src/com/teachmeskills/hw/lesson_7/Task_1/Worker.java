package com.teachmeskills.hw.lesson_7.Task_1;

public class Worker implements Jobname {
    final String position = "Worker";

    @Override
    public void jobName() {
        System.out.println(this.position);
    }
}
