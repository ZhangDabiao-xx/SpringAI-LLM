package com.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Test4 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://labuladong.online/zh/algo/home/");

        URLConnection conn = url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //String regex = "Java\\w{0,9}";
        //Pattern pattern = Pattern.compile(regex);
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            //Matcher matcher = pattern.matcher(line);
            //while (matcher.find()) {
            //    System.out.println(matcher.group());
            //}
        }
        br.close();
    }
}
