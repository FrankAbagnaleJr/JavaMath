package math01;

import lombok.Getter;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 16:28 周四
 * @Project_Name: JavaMath
 * @Version: 1.0
 * @description 枚举
 */
@Getter
public enum HandleObjEnum {
    REPLACE(new ChangeAStringAbstractHandle()),
    NUMBER(new ExNumStringAbstractHandle());

    private final Handle handle;

    HandleObjEnum(Handle handle){
        this.handle = handle;
    }

}
