package com;

import java.security.MessageDigest;

public class EncriptMD5 {
    //十六进制下的数字到字符的映射数组
    private final static String[] hexDigits = {"0", "1", "2", "3", "4",
            "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /*  把inputString加密并转成大写字母  */
    public static String CapitalMD5(String inputString){
        return  encodeByMD5(inputString).toUpperCase();
    }

    /*  把inputString加密成小写字母  */
    public static String AngelinaMD5 (String inputString){
        return  encodeByMD5(inputString);
    }

    /*  对字符串进行MD5加密 */
    private static String encodeByMD5(String originString){
        if ( originString != null ){
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] results = md.digest(originString.getBytes());
                String resultString = byteArrayToHexString(results);
                return resultString;
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return null;
    }
    /**
     * 转换字节数组未十六进制字符串
     * @param b 字节数组
     * @return 十六进制字符串
     */
    private static String byteArrayToHexString(byte[] b){
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++){
            resultSb.append(byteToHexSring(b[i]));
        }
        return resultSb.toString();
    }

    /** 将一个字节转化成十六进制形式的字符串  */
    private static String byteToHexSring(byte b){
        int n = b;
        if ( n < 0 ){
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
}
