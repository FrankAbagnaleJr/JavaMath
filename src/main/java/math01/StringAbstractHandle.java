package math01;

import java.util.Objects;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 15:43 周四
 * @Project_Name: JavaMath
 * @Version: 1.0
 * @description TODO
 */
public abstract class StringAbstractHandle implements Handle{

    @Override
    public String handle(String str) {
        if (Objects.isNull(str)) {
            throw new RuntimeException("字符不能为空！");
        }
        return doHandle(str);
    }

    public abstract String doHandle(String str);
}
