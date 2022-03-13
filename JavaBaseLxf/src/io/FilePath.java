package io;/**
 * Created by Administrator on 2021/11/23.
 */

import java.io.File;
import java.io.IOException;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/23 15:52
 **/
public class FilePath {

    public static void main(String[] args) throws IOException {
        File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(File.separator);
    }
}
