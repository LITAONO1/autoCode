package cn.sharehe.handle.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 关于正则的工具类
 */
public class CodeMatcher {
    /**
     * 返回方法头中最后一个的参数名字
     * @param code 方法格式
     * @return
     */
    public static String MethodFieldName(String code){
        Pattern pat=Pattern.compile("(?<=\\s)[\\S]{1,100}?(?=\\))");
        Matcher mat=pat.matcher(code);
        String tem=null;
        if(mat.find()){
            tem=mat.group();
        }else{
            throw new RuntimeException("方法格式错误");
        }
        pat=null;
        mat=null;
        return tem;
    }

    /**
     * 匹配方法中是否有map 若有则返回true
     * @param meth
     * @return 判断结果
     */
    public static boolean MethodFieldType(String meth){
        String pat="Map|HashMap";
        Pattern patt=Pattern.compile(pat);
        Matcher mat= patt.matcher(meth);
        return mat.find();
    }

    /**
     * 根据整个方法格式放回方法名的方法格式
     * @param code 方法格式
     * @return
     */
    public static String MethodName(String code){
        Pattern pat=Pattern.compile("(?<=\\s)[\\S]{1,100}?(?=\\()");
        Matcher mat=pat.matcher(code);
        String tem=null;
        if(mat.find()){
            tem=mat.group();
        }else{
            throw new RuntimeException("方法格式错误");
        }
        pat=null;
        mat=null;
        return tem;
    }


}
