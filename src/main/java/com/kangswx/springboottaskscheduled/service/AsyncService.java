package com.kangswx.springboottaskscheduled.service;

public interface AsyncService {

    void firstTack() throws InterruptedException;

    void secondTask() throws InterruptedException;

    void thirdTask() throws InterruptedException;
}
