/*
GenericWhitespace


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.genericwhitespace;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class InputGenericWhitespaceWithEmoji {

    /* ππ»dsad */public static class SomeClass { /* π */ // ok

        public static class Nested<V> {

            private Nested() {

            }
        }
    }
    public <V> void methodName(V value) {

        /* ππ»  π */ Supplier<?> t = InputGenericWhitespaceMethodRef1.Nested2<V>::new;

        // π da
        List<List<String>[]>
           /*π π€π» asd*/     listOfListOFArrays;

    }

    interface NumberEnum<T
 > { /*innerπ enum*/} // violation ''>' is preceded with whitespace'

    public int getConstructor(Class<?>... parameterTypes)
    {
        Collections.<Object>emptySet();
        Collections. /*da sdπsd*/ <Object> emptySet(); // 2 violations
        return 666;
    }
    Object ok2 = new <String>Outer.Inner();
    Object notOkStart = new<String>Outer.Inner(); // violation ''<' is not preceded with whitespace'
    /* πasd*/ public static class IntEnumValueType3 <E extends Enum<E>> {
        // violation above ''<' is preceded with whitespace'
    }

}
