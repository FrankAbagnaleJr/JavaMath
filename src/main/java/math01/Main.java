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
        String hantleStr = handleString(HandleObjEnum.REPLACE, "ABCDA");
        System.out.println(hantleStr);

        //创建个NumberHandle字符处理类，把字符串给他，就能把字符串中数字都删掉，返回新字符串,方法里面已经做了非空判断，如果传入null，会抛RuntimeException
        String exNumStr = handleString(HandleObjEnum.NUMBER, "a1b2c3d4e5f6");
        System.out.println(exNumStr);

    }

    static String handleString(HandleObjEnum objEnum,String str){
        return objEnum.getHandle().handle(str);
    }
}
