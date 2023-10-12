package math01;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 15:49 周四
 * @Project_Name: JavaMath
 * @Version: 1.0
 * @description TODO
 */
public class Main {
    public static void main(String[] args) {
        //创建个WordsHandle字符处理类，把字符串给他，就能把字符串中的A换成@,方法里面已经做了非空判断，如果传入null，会抛RuntimeException
        StringHandle wordsHandle = new StringHandle();
        String word = wordsHandle.handle("ABCDA");
        System.out.println(word);

        //创建个NumberHandle字符处理类，把字符串给他，就能把字符串中数字都删掉，返回新字符串,方法里面已经做了非空判断，如果传入null，会抛RuntimeException
        NumberHandle numberHandle = new NumberHandle();
        String exceptNum = numberHandle.handle("1a2b3c4d5f6g");
        System.out.println(exceptNum);

    }
}
