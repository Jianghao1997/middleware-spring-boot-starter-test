package cn.hoodee.middleware.test.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * Package: com.wwm.onlinestore.utils
 * Description：
 * Author: 蒋豪
 * Date:  2021.04.08 15:08
 * Modified By:
 */
@Data
public class ResultResponse implements Serializable {

    private static final long serialVersionUID = -6957361951748382519L;

    /** 错误码 */
    private Integer code;
    /** 错误信息 */
    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public static ResultResponse Success(){
        ResultResponse response = new ResultResponse();
        response.setCode(Constants.ResponseCode.SUCCESS.getCode());
        response.setMsg(Constants.ResponseCode.SUCCESS.getDesc());
        return response;
    }

    public static ResultResponse Success(Object data){
        ResultResponse response = new ResultResponse();
        response.setCode(Constants.ResponseCode.SUCCESS.getCode());
        response.setMsg(Constants.ResponseCode.SUCCESS.getDesc());
        response.setData(data);
        return response;
    }
    public static ResultResponse Success(Object data, String msg){
        ResultResponse response = new ResultResponse();
        response.setCode(Constants.ResponseCode.SUCCESS.getCode());
        response.setMsg(msg);
        response.setData(data);
        return response;
    }
    public static ResultResponse Error(){
        ResultResponse response = new ResultResponse();
        response.setCode(Constants.ResponseCode.ERROR.getCode());
        response.setMsg(Constants.ResponseCode.ERROR.getDesc());
        return response;
    }
    public static ResultResponse Error(Integer code, String msg){
        ResultResponse response = new ResultResponse();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }
    public static ResultResponse Error(String msg){
        ResultResponse response = new ResultResponse();
        response.setCode(Constants.ResponseCode.ERROR.getCode());
        response.setMsg(msg);
        return response;
    }
}
