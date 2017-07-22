package com.java.utils;

import java.io.File;

/**
 * Created by baiyf on 17-7-19.
 */

public class FileUtil {

    /**
     * 递归删除目录下的所有文件及子目录下所有文件
     * @param paramFile 将要删除的文件目录
     * @return boolean Returns "true" if all deletions were successful.
     *                 If a deletion fails, the method stops attempting to
     *                 delete and returns "false".
     */
    public static boolean deleteDirectory(File paramFile) {
        if (paramFile.isDirectory()) {
            File[] arrayOfFile = paramFile.listFiles();
            for (int i = 0; i < arrayOfFile.length; i++) {
                if (!deleteDirectory(arrayOfFile[i])) {
                    return false;
                }
            }
        }
        return paramFile.delete();
    }
}
