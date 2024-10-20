package com.teachmeskills.hw.lesson_7.Task_1;

public class Accountant implements Jobname {
    final String position = "Accountant";

    @Override
    public void jobName() {
        System.out.println(this.position);
    }
}
