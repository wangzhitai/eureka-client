package com.study.model.response;

import java.util.List;

public class RealNameAccountResult {

    private List<UpdateRealNameOuter> updateRealNameOuters;
    private Integer total;

    public List<UpdateRealNameOuter> getUpdateRealNameOuters() {
        return updateRealNameOuters;
    }

    public void setUpdateRealNameOuters(List<UpdateRealNameOuter> updateRealNameOuters) {
        this.updateRealNameOuters = updateRealNameOuters;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
