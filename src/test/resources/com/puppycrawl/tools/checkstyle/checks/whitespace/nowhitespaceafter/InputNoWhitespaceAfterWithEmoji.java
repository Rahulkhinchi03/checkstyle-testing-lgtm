/*
NoWhitespaceAfter
allowLineBreaks = (default)true
tokens = ARRAY_INIT, AT, INC, DEC, UNARY_MINUS, UNARY_PLUS, BNOT, LNOT, DOT, TYPECAST, \
         ARRAY_DECLARATOR, INDEX_OP, LITERAL_SYNCHRONIZED, METHOD_REF


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.nowhitespaceafter;

public class InputNoWhitespaceAfterWithEmoji {

    String txt = new String ("sdð¤©ðð " );
    public String foo() {
        String []   s =  { "ðð", // 2 violations
                        "ðð12wq"
        };

        for (int i = 0; i < s.length; i++) {
            char[]c = "ð¤©ð".toCharArray();

        /* ðð»ð*/ char  []c2= "ð¤©ð".toCharArray(); // violation ''char' is followed by whitespace.'
        }
        return "ðð§ dsad "; // ok
    }
    public String foo2() {
        String str = (@ MyAnnotation String) "ð¤©dsaðadsad"; // 2 violations
        String str3 = str + "ð" + "sadsa" +"ðð§" +    " " ;
        return("  ðð  ");
    }

    public String foo3() {

        return  ! "ð". isEmpty() ?"dsaða":  "ð..ð" ; // 2 violations
    }

    public String[] foo4 () {
        return new String[] {
          "sdð"+  "ðð§",
                "ðð»"
        };
    }

}
