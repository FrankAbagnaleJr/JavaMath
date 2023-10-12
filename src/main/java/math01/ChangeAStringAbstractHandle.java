package math01;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 15:47 周四
 * @Project_Name: JavaMath
 * @Version: 1.0
 * @description 把字符串中的A变成@
 */
public class ChangeAStringAbstractHandle extends StringAbstractHandle {
    @Override
    public String doHandle(String str) {
        return str.replace("A", "@");
    }
}
