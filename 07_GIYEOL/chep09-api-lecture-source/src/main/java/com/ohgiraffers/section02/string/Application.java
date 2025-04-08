package com.ohgiraffers.section02.string;

public class Application {
    public static void main(String[] args) {
        int[] arr =new int[4];
        System.out.print(arr.length);
        /*
         * charAt(int index) : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         * 인덱스는 0부터 시작하는 숫자 체계를 의미하며
         * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundException이 발생한다.
         * */
        String str1 ="apple";
        for(int i=0;i<str1.length();i++){
            System.out.println("charat("+i+") :"+str1.charAt(i));
        }
        /*
         * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
         * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
         * 크면 양수를 반환한다.
         * 단, 이 메소드는 대소문자를 구분하여 비교한다.
         * */
        String str2 ="java";
        String str3 ="java";
        String str4 ="JAVA";
        String str5 ="oracle";
        System.out.println("comparto() : "+ (str2.compareTo(str3))); //0

        System.out.println("comparto() : "+ (str2.compareTo(str4))); //32
        System.out.println("comparto() : "+ (str4.compareTo(str2))); //-32

        System.out.println("comparto() : "+ (str2.compareTo(str5))); //-5
        System.out.println("comparto() : "+ (str5.compareTo(str2))); //5

        //compartoignorecase(): 대소문자 구문없이 문자가 같은지 확인
        System.out.println("compartoignorecase() : "+ (str3.compareToIgnoreCase(str4)));

        /*
         * concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
         * 원본 문자열에는 영향을 주지 않는다.
         * */
        System.out.println("contcat() :" + (str2.concat(str5)));
        System.out.println("str2 : "+str2);

        /*
         * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        String indexof = "javamysql";
        System.out.println("indexof(a) :" + indexof.indexOf('a'));
        System.out.println("indexof(z) :" + indexof.indexOf('z'));

        /*
         * lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        System.out.println("lastindexof(a) :" + indexof.lastIndexOf('a'));
        System.out.println("lastindexof(z) :" + indexof.lastIndexOf('z'));

       //trim() :문자열 앞 뒤에 공백을 제거한 문자열 반환
        String trimstr = " java ";
        System.out.println("trim() : #" + trimstr + "#");
        System.out.println("trim() : #" + trimstr.trim() + "#");
        System.out.println("trim() : #" + trimstr + "#");


        /*
         * toLowerCase() : 모든 문자를 소문자로 변환시킨다.
         * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
         * */
        String casestr = " javamysql ";
        System.out.println("tolower() : " + casestr.toLowerCase());
        System.out.println("toupper() : " + casestr.toUpperCase());

        //subString():문자열의 일부분을 잘라내어 새로운 문자열을 반환한다
        String javamysql = "javamysql";
        System.out.println("subString(3,6) :" + javamysql.substring(3, 6) ); //amy
        System.out.println("subString(3) :" + javamysql.substring(3 ) );// amysql
        System.out.println("subString :" + javamysql );

        // length() :문자열의 길이를 정수형으로 반환
        System.out.println("length() :" + javamysql.length());
        System.out.println("문자열의 길이 :" + "".length());

        // isEmpty():문자열의 길이가 0이면 true 아니면 false 반환
        System.out.println("isempty() :" + "".isEmpty());
        System.out.println("isempty() :" + "abc".isEmpty());


    }
}
