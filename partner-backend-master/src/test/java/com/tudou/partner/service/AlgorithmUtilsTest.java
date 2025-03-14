package com.tudou.partner.service;

import com.tudou.partner.utils.AlgorithmUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 算法工具类测试
 *
 * @author <a href="https://github.com/Camellia-nfl/">程序员土豆</a>
 * @from 
 */
public class AlgorithmUtilsTest {


    @Test
    void test() {
        String str1 = "土豆是狗";
        String str2 = "土豆不是狗";
        String str3 = "负责人 [tudou](https://t.zsxq.com/0emozsIJh)";
//        String str4 = "土豆是猫";
        // 1
        int score1 = AlgorithmUtils.minDistance(str1, str2);
        // 3
        int score2 = AlgorithmUtils.minDistance(str1, str3);
        System.out.println(score1);
        System.out.println(score2);
    }

    @Test
    void testCompareTags() {
        List<String> tagList1 = Arrays.asList("Java", "大一", "男");
        List<String> tagList2 = Arrays.asList("Java", "大一", "女");
        List<String> tagList3 = Arrays.asList("Python", "大二", "女");
        // 1
        int score1 = AlgorithmUtils.minDistance(tagList1, tagList2);
        // 3
        int score2 = AlgorithmUtils.minDistance(tagList1, tagList3);
        System.out.println(score1);
        System.out.println(score2);
    }

}
