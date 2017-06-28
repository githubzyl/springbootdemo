package com.example.demo.pdf;

import java.math.BigDecimal;

public class Utils {
    /**
     * 获取 基值
     * @param value 分子
     * @param baseValue 分母 应为本基金的基值
     * @return 
     * @create: 2015年12月28日 下午2:38:02 lyuanx
     * @history:
     */
    public static Double getFundNetBaseValue(String value,
            BigDecimal baseValue) {
        return Double.parseDouble(value) / baseValue.doubleValue();
    }

    /**
     * 计算每一个点的净值
     * @param nowNumberValue
     * @param oldNumberValue
     * @return 
     * @create: 2015年12月28日 下午2:36:35 lyuanx
     * @history:
     */
    public static BigDecimal getEachQuotValue(String nowNumberValue,
            Double oldNumberValue) {
        return new BigDecimal(
            Double.parseDouble(nowNumberValue) / oldNumberValue).setScale(4,
                BigDecimal.ROUND_HALF_UP);
    }

}
