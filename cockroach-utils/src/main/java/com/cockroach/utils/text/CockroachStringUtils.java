package com.cockroach.utils.text;

/**
 * . 字符串操作工具
 * <p>
 * -----------------------------------------------------------------------------
 * <p>
 * 工程名： cockroach-utils
 * <p>
 * 授 权： (C) Copyright Unimedia Corporation 2019-2050
 * <p>
 * 公 司： 北京玖众传媒股份有限公司
 * <p>
 * -----------------------------------------------------------------------------
 * 注 意： 本内容仅限于北京玖众传媒股份有限公司公司内部使用，禁止转发
 *
 * @author luzq
 * @version 1.0
 * @createDate 2019-08-13 09:45
 * @since JDK  1.8
 */
public class CockroachStringUtils {
    /**
     * 首字母转换小写
     * @param old 原字符串
     * @return    新字符串
     */
    public static String toFristLowerCase(final CharSequence old){
        if(isEmpty(old)){
            throw new NullPointerException("String cannot be empty");
        }
        char[] oldCharArray=old.toString().toCharArray();
        /** 只处理大写字母，其他字符串不处理 */
        if (oldCharArray[0]>=65&&oldCharArray[0]<=106){
            oldCharArray[0]+=32;
        }

        return String.valueOf(oldCharArray);
    }

    /**
     * 首字母转换大写
     * @param old 原字符串
     * @return    新字符串
     */
    public static String toFristUpperCase(final CharSequence old){
        if(isEmpty(old)){
            throw new NullPointerException("String cannot be empty");
        }
        char[] oldCharArray=old.toString().toCharArray();
        /** 只处理小写字母，其他字符串不处理 */
        if (oldCharArray[0]>=97&&oldCharArray[0]<=122){
            oldCharArray[0]-=32;
        }

        return String.valueOf(oldCharArray);
    }

    /**
     * 判断字符串不为空
     * @param cs 字符串
     * @return
     */
    public static boolean isNotEmpty(final CharSequence cs){
        return !isEmpty(cs);
    }

    /**
     * 判断字符串为空
     * @param cs 字符串
     * @return
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
