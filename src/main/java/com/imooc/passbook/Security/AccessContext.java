package com.imooc.passbook.Security;
/**
 * <h1>using ThreadLocal to store the Token message of each thread separately</h1>
 * */
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<String>();
    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }

    public static void clearAccessKey() {
        token.remove();
    }
}
