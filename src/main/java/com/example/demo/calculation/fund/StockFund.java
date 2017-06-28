package com.example.demo.calculation.fund;

/**
 * 股票基金相关计算指标
 * 
 * @author: zhaoyl
 * @since: 2017年6月5日 下午2:05:46
 * @history:
 */
public class StockFund {

	/**
	 * 净值增长率
	 * 作用：反映基金经营业绩的指标
	 * @param endShareNetWorth 期末份额净值
	 * @param startShareNetWorth 期初份额净值
	 * @param dividendsPerPeriod 每份期间分红
	 * @return
	 * @create: 2017年6月5日 下午2:09:59 zhaoyl
	 * @history:
	 */
	public String calNetGrowthRate(double endShareNetWorth, double startShareNetWorth, double dividendsPerPeriod) {
		double netGrowth = (endShareNetWorth - startShareNetWorth + dividendsPerPeriod) / startShareNetWorth;
		netGrowth *= 100;
		return netGrowth + "%";
	}
	
	/**
	 * 贝塔值
	 * 作用：反映基金风险大小的指标
	 * 贝塔值>1,表示该基金是一只活跃或激进型基金；贝塔值<1,表示该基金是一只稳定或防御型基金
	 * @param netGrowthRate
	 * @param stockIndexGrowthRate
	 * @return
	 * @create: 2017年6月5日 下午2:21:27 zhaoyl
	 * @history:
	 */
	public double calBetaValue(double netGrowthRate, double stockIndexGrowthRate){
		return netGrowthRate / stockIndexGrowthRate;
	}
	
	public String calHoldingConcentration(double topTenAwkwardness){
		
		return null;
	}

}
