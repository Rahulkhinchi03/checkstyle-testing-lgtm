/*
EmptyForInitializerPad
option = SPACE


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.emptyforinitializerpad;

public class InputEmptyForInitializerPadWithEmoji {

    void method1() {
        String s = "asddað¤©ðð§";
        int j = 0;
        for (int i = 0; i < s.length() && s.substring(i) == "ð¤©ðð§" ; ) {

        }

        for (int i = 0; i < s.length() && s.substring(i) == "ð¤©ðð§asd";i++) {

        }

        for(;j < s.length() && // violation '';' is not preceded with whitespace'
                s.substring(j) =="ð¤©ð";) {

        }

        s = "ð¤©að¤©"; for (;j <s.length() // violation '';' is not preceded with whitespace.'
                && s.substring(j) =="ð¤©ð§";
              j++ ) {

        }

        s = "dað¤©dað¤©"; for (  ;
              j < s.length() && s.substring(j) == "ð¤©ðð§"
                ;
              j++ ) {

        }
    }
}
