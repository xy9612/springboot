package org.spring.springboot.result;

/**
 * 应用系统级别的错误码
 * <p>
 * Created by bysocket on 14/03/2017.
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface {
    SUCCESS("0", "success"),
    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
