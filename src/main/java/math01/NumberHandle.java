package math01;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 15:52 周四
 * @Project_Name: JavaMath
 * @Version: 1.0
 * @description 把字符串中的数字都去掉
 */
public class NumberHandle extends AbstractHandle{
    @Override
    public String doHandle(String str) {
        //正则表达式\\d表示匹配数字，而空字符串""表示将匹配到的数字替换为空
        return str.replaceAll("\\d","");
    }
}
