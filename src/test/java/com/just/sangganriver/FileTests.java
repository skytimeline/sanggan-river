package com.just.sangganriver;

import com.just.sangganriver.tools.io.FileTools;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class FileTests {

    @Autowired
    private Environment env;

    @Test
    void createFileFullPathIndex() {
        FileTools.create(env.getProperty("folder.path"));
    }
}
