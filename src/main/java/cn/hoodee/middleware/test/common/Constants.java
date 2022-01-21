package cn.hoodee.middleware.test.common;

/**
 * Package: cn.middleware.common.common
 *
 * @Description：
 * @Author: 蒋豪
 * @Date: 2022.01.21 20:42
 * @Modified By:
 */
public class Constants {

    public enum ResponseCode {
        SUCCESS(200,"SUCCESS"),
        ERROR(-1,"ERROR"),
        REQUEST_PARAMS_ERROR(400,"请求参数错误"),
        SERVERERROR(500,"服务器内部错误"),
        NO_LOGIN(1006,"登录状态失效"),
        ;
        private final int code;
        private final String desc;
        ResponseCode(int code, String desc){
            this.code = code;
            this.desc = desc;
        }
        public int getCode() {
            return code;
        }
        public String getDesc() {
            return desc;
        }
    }
}
