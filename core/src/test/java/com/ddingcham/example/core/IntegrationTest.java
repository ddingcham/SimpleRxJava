package com.ddingcham.example.core;

import com.ddingcham.example.core.executor.MainExecutor;
import org.junit.Test;

public class IntegrationTest {

    @Test
    public void runExecutor() throws InterruptedException {
        MainExecutor mainExecutor = new MainExecutor();
//        Scheduler main = Schedulers.from(mainExecutor);

        mainExecutor.runLoop();
    }
}
