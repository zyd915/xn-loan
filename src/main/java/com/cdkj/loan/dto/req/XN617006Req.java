package com.cdkj.loan.dto.req;

/**
 * 合规审查
 * @author: asus 
 * @since: 2016年12月24日 下午6:19:05 
 * @history:
 */
public class XN617006Req {

    public String code;

    public String approveResult;

    private String approverUser;

    public String approveNote;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getApproveResult() {
        return approveResult;
    }

    public void setApproveResult(String approveResult) {
        this.approveResult = approveResult;
    }

    public String getApproverUser() {
        return approverUser;
    }

    public void setApproverUser(String approverUser) {
        this.approverUser = approverUser;
    }

    public String getApproveNote() {
        return approveNote;
    }

    public void setApproveNote(String approveNote) {
        this.approveNote = approveNote;
    }
}
