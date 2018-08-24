package com.am.es.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class ThreadPools implements CommandLineRunner {

    public static ExecutorService executorService = null;

    @Override
    public void run(String... args) throws Exception {
        //线程池允许同时存在线程数
        getInstance();
    }

    private void getInstance() {
        executorService = Executors.newFixedThreadPool(100);
    }
}
