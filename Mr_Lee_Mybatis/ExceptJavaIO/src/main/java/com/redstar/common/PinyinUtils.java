package com.redstar.common;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/10/23 14:39
 * @Description:
 * @Content:
 */
public class PinyinUtils {
    public static String getFirst(String a){
        String pinyinName = "";
        if (S){
            if (isChinese(a)){
                //是汉字
                char[] nameChar = a.toCharArray();
                HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
                defaultFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);
                defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
                for (int i = 0; i < nameChar.length; i++) {
                    try {
                        pinyinName += PinyinHelper.toHanyuPinyinStringArray(
                                nameChar[i], defaultFormat)[0].charAt(0);
                    } catch (BadHanyuPinyinOutputFormatCombination e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                return pinyinName;
            }else if (isEnglish(a)){
                //不是汉字
                if (a.length()>=1){
                    pinyinName = a.substring(0,1).toUpperCase();
                    return pinyinName;
                }
            }else {
                return "1";
            }
        }
        return null;
    }
    private static boolean isChinese(String str) {
        String regEx = "[\u4e00-\u9fa5]";
        Pattern pat = Pattern.compile(regEx);
        Matcher matcher = pat.matcher(str);
        boolean flg = false;
        if (matcher.find())
            flg = true;

        return flg;
    }
    private static boolean isEnglish(String str) {
        String regEx = "[A-Za-z]";
        Pattern pat = Pattern.compile(regEx);
        Matcher matcher = pat.matcher(str);
        boolean flg = false;
        if (matcher.find())
            flg = true;

        return flg;
    }
}
