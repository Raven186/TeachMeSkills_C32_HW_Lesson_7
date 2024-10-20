package com.teachmeskills.hw.lesson_7.Task_1;

public class Director implements Jobname {
    final String position = "Director";

    @Override
    public void jobName() {
        System.out.println(this.position);
    }
}
