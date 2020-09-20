/**
 * 杭州天谷信息科技有限公司源代码，版权归杭州天谷信息科技有限公司所有 <br>
 * 项目名称：esignpro-service <br>
 * 文件名：EnvelopeFlowTypeEnum.java <br>
 * 包：cn.tsign.www.esignpro.util.enums.envelope <br>
 * 描述： <br>
 * 修改历史： <br>
 * 1.[2018年3月2日上午10:43:25]创建文件 by flh
 */
package com.study.enums;

/**
 * 类名：EnvelopeFlowTypeEnum.java <br>
 * 功能说明： <br>
 * 修改历史： <br>
 * 1.[2018年3月2日上午10:43:25]创建类
 */
public enum UserTypeEnum {

    /** Common：普通;Cancellation：作废;Strict：严格 */
    Common("Common"),

    Cancellation("Cancellation"),

    Strict("Strict"),
    ;

    private String flowType;

    public String getFlowType() {
        return flowType;
    }

    UserTypeEnum(String flowType) {
        this.flowType = flowType;
    }

    public static UserTypeEnum getUserTypeEnum(String flowType) {
        UserTypeEnum[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            UserTypeEnum hash = var1[var3];
            if (hash.getFlowType().equals(flowType)) {
                return hash;
            }
        }
        return null;
    }
}
