package com.study.model.response;

import lombok.Data;

@Data
public class UpdateRealNameOuter {

    private String uniqueId;
    private String name;
    private Integer status;
}
