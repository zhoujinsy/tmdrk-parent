package com.tmdrk.chat.common.entity;

/**
 * @ClassName Result
 * @Description TODO
 * @Author zhoujie
 * @Date 2019/7/18 16:19
 * @Version 1.0
 **/
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public Result(){

    }
    public Result(Integer code,String msg){
        this(code,msg,null);
    }

    public Result(Integer code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
