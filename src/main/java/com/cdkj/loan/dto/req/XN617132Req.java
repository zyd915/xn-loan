/**
 * @Title XNlh5012Req.java 
 * @Package com.xnjr.moom.dto.req 
 * @Description 
 * @author haiqingzheng  
 * @date 2016年4月17日 下午6:54:44 
 * @version V1.0   
 */
package com.cdkj.loan.dto.req;

/** 
 * @author: haiqingzheng 
 * @since: 2016年4月17日 下午6:54:44 
 * @history:
 */
public class XN617132Req {
    // 编号（必填）
    private String id;

    // value（必填）
    private String dvalue;

    // 备注（选填）
    private String remark;

    private String updater;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDvalue() {
        return dvalue;
    }

    public void setDvalue(String dvalue) {
        this.dvalue = dvalue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}
