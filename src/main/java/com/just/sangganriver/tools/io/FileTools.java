package com.just.sangganriver.tools.io;

import com.google.common.io.Files;

import java.io.File;

/**
 * @author Just
 */
public class FileTools {

    /**
     * 生成指定文件夹中文件全路径索引
     *
     * @param path 文件夹绝对路径
     */
    public static void create(String path) {
        File           file  = new File(path);
        Iterable<File> files = Files.fileTraverser().breadthFirst(file);
        for (File tmpFile : files) {
            if (tmpFile.isFile()) {
                System.out.println("文件全路径: " + tmpFile);
            }
        }
    }
}
