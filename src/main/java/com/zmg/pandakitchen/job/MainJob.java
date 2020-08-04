package com.zmg.pandakitchen.job;

import com.alibaba.fastjson.JSONObject;
import com.zmg.pandakitchen.bean.SttlBillSummary;
import com.zmg.pandakitchen.utils.ZxingUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

/**
 * @author Panda
 */
public class MainJob {


    public static void main(String[] args) throws FileNotFoundException {
        // 生成二维码
        File qaFile = new File("D:\\tmp\\测试二维码.png");
        createQACode(qaFile);



    }

    private static void createQACode(File qaFile) throws FileNotFoundException {
        OutputStream outputStream = new FileOutputStream(qaFile);

        SttlBillSummary sttlBillSummary = initSttlBillSummary();
        String content = JSONObject.toJSONString(sttlBillSummary);

        // create qacode
        ZxingUtils.creatQaCode(content, outputStream);
    }

    private static SttlBillSummary initSttlBillSummary() {
        SttlBillSummary sttlBillSummary = new SttlBillSummary();
        sttlBillSummary.setCaseMoney(new BigDecimal(50000000));
        sttlBillSummary.setCaseTotal(256L);
        sttlBillSummary.setClaimantMan("王有钱");
        sttlBillSummary.setPeriod("从2019-09-08到2019-12-12");
        sttlBillSummary.setSttlBillSn("AJ20201212");
        return sttlBillSummary;
    }

}
