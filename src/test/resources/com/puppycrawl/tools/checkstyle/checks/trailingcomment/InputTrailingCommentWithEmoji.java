/*
TrailingComment
format = (default)^[\s});]*$
legalComment = ^ this is ok


*/

package com.puppycrawl.tools.checkstyle.checks.trailingcomment;

public class InputTrailingCommentWithEmoji {
    // violation below
    String a = "ð§ð¥³ð ð¨"; /*string with emoji */
    // violation below
    String b = "ðð»ð¤ð»ððð"; // another string

    /* yet another */String c = "ðððð"; /* this is ok */
    String d = "ð§ð¥³"; // this is ok
  /*
  * ðaðbðcð // violation below
  * ð ðð» ð¤ð» ð*/  void test1() { /* some
   ð  adsad ð                  /*comments */
    }
    // violation below
    /*ð ð*/ // ð¤ð»ð¤ð»

    /* ð â ï¸ */ // ð¿ asdð± // violation
    /* ð± ð */ /*ð ð¥¶ */ // violation

    /**  // comment
     * ð¤ð»qð¥³wðð»eð rðð»tð¨y
     */
    /* ðð» ðð»    */  void test2() {} // violation
}
