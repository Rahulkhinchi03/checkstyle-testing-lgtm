/*
WhitespaceAfter
tokens = (default)COMMA, SEMI, TYPECAST, LITERAL_IF, LITERAL_ELSE, LITERAL_WHILE, \
         LITERAL_DO, LITERAL_FOR, DO_WHILE


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.whitespaceafter;

class InputWhitespaceAfterWithEmoji {

    private String[] emoji = new String[]{"ð¤©ð" ,"ð§","ð§ð§", // 2 violations
        "ð§ð§"};

    void foo1() {

        int i = 0, count = 0;
        // ok
        do {
            count += "ðð§".charAt(i) == "ð¤©ð".charAt(i) ? 1 : 0;
        }
        while ("ðð§".equals("ðð§weqwe"));

        while ("ð¤©".isEmpty()) ;
        while ("ð".equals("0sda"));
        while (true)
            if ("ðð".equals("ðdsaewwrrwð§")) { // ok
                String b = "ðð";return; // violation '';' is not followed by whitespace'
            } else {
                if (!!"ðð".equals("ðdsaewwrrwð§")) return;
            }
    }

    void foo2() {
        Object obj = ("ðdsaewwrrwð§");
        obj = (java.lang.
                Object)"ð"; // violation ''typecast' is not followed by whitespace'
        obj = (java.lang.
            Object) "ð"; // ok
    }

    void foo3() {
        char[] a = ("ððð" +
            "asdð§").toString(
        ).toCharArray();

        for (int i = 0;i < 5 && emoji[i].equals("ð");i++) { // 2 violations
        }

    }
}
