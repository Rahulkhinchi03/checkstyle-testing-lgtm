/* Config:                                                                  //indent:0 exp:0
 * This test-input is intended to be checked using following configuration: //indent:1 exp:1
 *                                                                          //indent:1 exp:1
 * arrayInitIndent = 2                                                      //indent:1 exp:1
 * basicOffset = 2                                                          //indent:1 exp:1
 * braceAdjustment = 2                                                      //indent:1 exp:1
 * caseIndent = 2                                                           //indent:1 exp:1
 * forceStrictCondition = false                                             //indent:1 exp:1
 * lineWrappingIndentation = 4                                              //indent:1 exp:1
 * tabWidth = 4                                                             //indent:1 exp:1
 * throwsIndent = 4                                                         //indent:1 exp:1
 */                                                                           //indent:1 exp:1

package com.puppycrawl.tools.checkstyle.checks.indentation.indentation;//indent:0 exp:0

public class InputIndentationArrayInitIndentWithEmoji { //indent:0 exp:0
  private static final String[] UNSECURED_PATHS = { //indent:2 exp:2
    "ð§ ð¥³", //indent:4 exp:4
     "2ðð»", //indent:5 exp:4,6,52,54 warn
  }; //indent:2 exp:2

  String[] array3 = new String[] { //indent:2 exp:2
    " 1ð ð¤ð»", //indent:4 exp:4
        "2ðð", //indent:8 exp:4,6,35,37 warn
          "ðð3" //indent:10 exp:4,6,35,37 warn
  }; //indent:2 exp:2

  String[][] a = { //indent:2 exp:2
    {"ð ð¤ð»da sd", "d ð "  }, //indent:4 exp:4
          {"ðð dwe", " 1ð ð¤ð»", //indent:10 exp:4,6,19,21,25 warn
      "2ðð", //indent:6 exp:6
      "ð¤ð»ðe"} //indent:6 exp:6
  }; //indent:2 exp:2
  void test() { //indent:2 exp:2
    String[] array3 = new String[] { //indent:4 exp:4
      "ð 5", //indent:6 exp:6
      " ð¤ð»ð  ", //indent:6 exp:6
      "ð¤© ð§  ddda" //indent:6 exp:6
    }; //indent:4 exp:4
  } //indent:2 exp:2
} //indent:0 exp:0
