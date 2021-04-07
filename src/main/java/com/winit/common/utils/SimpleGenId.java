package com.winit.common.utils;

import tk.mybatis.mapper.genid.GenId;

public class SimpleGenId implements GenId<Integer> {
    private Long    time;
    private Integer seq;

    @Override
    public synchronized Integer genId(String table, String column) {
        return 0;
    }
}

