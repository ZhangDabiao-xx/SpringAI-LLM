package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Test5 {
    public static void main(String[] args){
        /*
        * 需求1：爬取版本号为8，11，17的java文本，只要java,不显示版本号
        * 需求2：爬取版本号为8，11，17的java文本。正确的爬取结果为：java8 java11 java17 java17
        * 需求3：爬取除了版本号为8，11，17的java文本
        * 需求4：贪婪爬取
        * 需求5：非贪婪爬取
        * */

        String str = "Java自从95年问世以来，abbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaabbbbb" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11 因为这两个是长期支持版本，" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //需求1
        String regex = "((?i)java)(?=8|11|17)";

        //需求2
        String regex2 = "((?i)java)(?:8|11|17)";

        //需求3
        String regex3 = "((?i)java)(?!8|11|17)";

        //需求4
        String regex4 = "ab+";//贪婪爬取，尽可能多爬取

        //需求5
        String regex5 = "ab+?";//非贪婪爬取，尽可能少爬取

        Pattern p = Pattern.compile(regex5);
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
