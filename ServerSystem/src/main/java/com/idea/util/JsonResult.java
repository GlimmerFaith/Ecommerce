package com.idea.util;

import lombok.Data;

import java.io.Serializable;

/**
 * Json格式的数据进行响应
 * @param <E>
 */
@Data
public class JsonResult<E> implements Serializable {
    private Integer state;
    private String message;
    private E Data;

    public JsonResult() {
    }

    public JsonResult(Integer state) {
        this.state = state;
    }
    public JsonResult(Throwable throwable) {
        this.message = throwable.getMessage();
    }

    public JsonResult(Integer state, E data) {
        this.state = state;
        Data = data;
    }
}
