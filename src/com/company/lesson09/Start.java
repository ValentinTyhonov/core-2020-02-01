package com.company.lesson09;

public class Start
{
    public static void main(String[] args)
    {
        "test ".length(); // 5
        " ".length(); // 1
        "test".equals("test"); // true
        "test".equals("Test"); // false
        "test".equalsIgnoreCase("Test"); // true

        "test".charAt(1); // e
//        "test".charAt(10); // IndexOutOfBoundException
        "test".indexOf("t"); // 0
        "test".lastIndexOf("t"); // 3
        "test test".lastIndexOf("t"); // 8
        "test test".indexOf("t", 4); // 5
        "test".indexOf("es"); // 1


        "aaa".compareTo("abb"); // 1
        "acd".compareTo("abc"); // -1
        "abc".compareTo("abc"); // 0
        "abc".compareTo("ABC"); // -1

        "test".contains("es"); // true
        "test".contains("ES"); // false
        "test".startsWith("te"); // true
        "test".startsWith("st"); // false
        "test".endsWith("st"); // true

        "test test".split(" "); // ["test", "test"]
        "test, test1, test2".split(", "); // ["test", "test1", "test2"]
        "line 1\nline2\nline3".split("\n"); // ["line1", "line2", "line3"]

        "test".substring(1); // est
        "test".substring(1, 3); // es [1, 2)
        "testteste".substring(2, 5); // stt [2, 5)

        "TesT".toLowerCase(); // test
        "TesT".toUpperCase(); // TEST

        "test".isEmpty(); // false
        " ".isEmpty(); // false
        "".isEmpty(); // true
        "test".concat(" test"); // == "test" + " test" -> "test test"

        "  \t \n   bla bla bla \n".trim(); // "bla bla bla"

        System.out.println("Hello World, Hello".replace("Hello", "Hi"));

        StringBuilder builder = new StringBuilder("13223fe34qwegewrqsgq");
        builder.setLength(5);
        builder.setCharAt(1, 'f');
        builder.insert(3, "aaa")
            .append("bbb")
            .append("ccc")
            .delete(3, 5)
            .reverse()
            .replace(1, 5, "00000");
        System.out.println(builder);
    }
}
