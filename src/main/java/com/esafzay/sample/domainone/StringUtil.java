package com.esafzay.sample.domainone;

final public class StringUtil {

  private StringUtil() {
    // Not to be instantiated
  }

  public static String subString(final String string) {
    return string.substring(1);
  }
}
