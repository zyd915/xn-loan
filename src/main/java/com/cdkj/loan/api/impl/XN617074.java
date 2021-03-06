package com.cdkj.loan.api.impl;

import com.cdkj.loan.ao.IRepayAO;
import com.cdkj.loan.api.AProcessor;
import com.cdkj.loan.common.JsonUtil;
import com.cdkj.loan.core.StringValidater;
import com.cdkj.loan.dto.req.XN617074Req;
import com.cdkj.loan.dto.res.BooleanRes;
import com.cdkj.loan.exception.BizException;
import com.cdkj.loan.exception.ParaException;
import com.cdkj.loan.spring.SpringContextHolder;

/**
 * 已还欠款
 * @author: asus 
 * @since: 2017年1月8日 下午1:04:24 
 * @history:
 */
public class XN617074 extends AProcessor {
    private IRepayAO repayAO = SpringContextHolder.getBean(IRepayAO.class);

    private XN617074Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        repayAO.editAlready(req.getCode());
        return new BooleanRes(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN617074Req.class);
        StringValidater.validateBlank(req.getCode());
    }

}
