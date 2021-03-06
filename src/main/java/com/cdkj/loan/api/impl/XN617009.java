package com.cdkj.loan.api.impl;

import com.cdkj.loan.ao.ICreditOrderAO;
import com.cdkj.loan.api.AProcessor;
import com.cdkj.loan.common.JsonUtil;
import com.cdkj.loan.core.StringValidater;
import com.cdkj.loan.dto.req.XN617009Req;
import com.cdkj.loan.exception.BizException;
import com.cdkj.loan.exception.ParaException;
import com.cdkj.loan.spring.SpringContextHolder;

/**
 * 请款资料补充
 * @author: asus 
 * @since: 2016年12月24日 下午7:42:36 
 * @history:
 */
public class XN617009 extends AProcessor {
    private ICreditOrderAO creditOrderAO = SpringContextHolder
        .getBean(ICreditOrderAO.class);

    private XN617009Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        creditOrderAO.editPayout(req.getCode(), req.getData(),
            req.getUpdater(), req.getRemark());
        return new Boolean(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN617009Req.class);
        StringValidater.validateBlank(req.getCode(), req.getData(),
            req.getUpdater());
    }

}
