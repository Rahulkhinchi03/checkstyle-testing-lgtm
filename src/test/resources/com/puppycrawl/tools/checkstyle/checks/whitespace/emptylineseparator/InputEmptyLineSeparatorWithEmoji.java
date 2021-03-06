/*
EmptyLineSeparator
allowNoEmptyLineBetweenFields = (default)false
allowMultipleEmptyLines = false
allowMultipleEmptyLinesInsideClassMembers = false
tokens = (default)PACKAGE_DEF, IMPORT, STATIC_IMPORT, CLASS_DEF, INTERFACE_DEF, ENUM_DEF, \
         STATIC_INIT, INSTANCE_INIT, METHOD_DEF, CTOR_DEF, VARIABLE_DEF, RECORD_DEF, \
         COMPACT_CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.emptylineseparator; // ok
/**
 * Some comments here ðð»
 ðð» */

public class InputEmptyLineSeparatorWithEmoji { // ok



    String s = "ðð»sas"; // violation ''VARIABLE_DEF' has more than 1 empty lines before.'

            String s2 = "sasdsðð»";


    String s3 = "ðð»"; // violation ''VARIABLE_DEF' has more than 1 empty lines before.'

    void foo()
    {
        for (int i = 1; i < 5; i++) {
        }
            // violation 'more than 1 empty line after this line.'




        for(int i = 1;i < 5;i++);
    }
}
class InputEmptyLineSeparatorWithEmoji2{ public static boolean foo2() {return "ð ".equals("daðð»");}
// violation above ''CLASS_DEF' should be separated from previous line'

}
