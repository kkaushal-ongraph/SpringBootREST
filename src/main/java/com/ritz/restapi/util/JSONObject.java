package com.ritz.restapi.util;

/**
 * Created by admin on 4/7/2017.
 */
public class JSONObject {

    private String messsage;
    private Object data;

    public JSONObject(String messsage, Object data) {
        this.messsage = messsage;
        this.data = data;
    }


    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
