package com.zmg.pandakitchen.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 结算单摘要
 * @author Panda
 */
@Data
public class SttlBillSummary {

    private String period;

    private Long caseTotal;

    private BigDecimal caseMoney;

    private String claimantMan;

    private String sttlBillSn;
}
