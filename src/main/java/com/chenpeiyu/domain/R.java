package com.chenpeiyu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 进行表现层消息一致性处理
 */

@Data
public class R {
    private boolean flag;

    private Object data;

    public R() {
    }

    public R(boolean flag) {
        this.flag = flag;
    }
    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
