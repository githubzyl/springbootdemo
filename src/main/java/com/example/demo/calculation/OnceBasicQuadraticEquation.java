package com.example.demo.calculation;

/**
 * 一元二次方程模型：ax^2+bx+c=0 以及计算根的方法
 * 
 * @author: zhaoyl
 * @since: 2017年6月5日 上午11:16:40
 * @history:
 */
public class OnceBasicQuadraticEquation {

	private double a; // 方程的二次项系数
	private double b; // 方程的一次项系数
	private double c; // 方程的常数项

	private boolean hasRoot = false;// 是否有根,false表示无解
	private int rootNum = -1;// 根的个数,-1表示有无穷多个解
	private double firstRoot;// 第一个根
	private double secongRoot;// 第二个根

	public OnceBasicQuadraticEquation() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}

	public OnceBasicQuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.calculateRoot();// 计算根
	}

	// 求解并显示实根或复根的方法
	public void calculateRoot() // 求解并显示实根或复根的方法
	{
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("一元二次方程：" + getA() + "x^2+" // a、b、c全为零时，定义方程有无穷多解。
							+ getB() + "x+" + getC() + "\t有无穷多解。");
					this.hasRoot = true;
				} else {
					// 二次项和一次项系数为零，但常数项不为零，方程变为不等式，无解。
					System.out.println("一元二次方程：" + getA() + "x^2+" + getB() + "x+" + getC() + "\t无解。");
				}
			} else {
				// 二次项系数为零，一次项系数不为零，方程是一次方程，有唯一解。
				double result = 0;
				result = -getC() / getB();
				System.out.println("一元二次方程：" + getA() + "x^2+" + getB() + "x+" + getC() + "\t有唯一解：" + result);
				this.hasRoot = true;
				this.rootNum = 1;
				this.firstRoot = this.secongRoot = result;
			}
		} else {// 二次项系数不为零，方程有两个实根或复根。
			if (getDlt() == 0) { // 判别式Δ=b^2-4ac=0，方程有两个相等实根。
				double result = 0;
				result = -getB() / (2 * getA());
				System.out.println("一元二次方程：" + getA() + "x^2+" + getB() + "x+" + getC() + "\t有唯一解：" + result);
				this.hasRoot = true;
				this.rootNum = 1;
				this.firstRoot = this.secongRoot = result;
			} else if (getDlt() > 0) { // 判别式Δ=b^2-4ac>0，方程有两个相异实根。
				System.out.println("一元二次方程：" + getA() + "x^2+" + getB() + "x+" + getC() + "\t有两个实根：" + getLeftRoot()
						+ "和" + getRightRoot());
				this.hasRoot = true;
				this.rootNum = 2;
				this.firstRoot = getLeftRoot();
				this.secongRoot = getRightRoot();
			} else {// 判别式Δ=b^2-4ac<0，方程有两个复根。
				// double imaginaryNumber1 = 0;
				double imaginaryNumber = 0;
				double realNumber = 0;
				imaginaryNumber = Math.sqrt(-getDlt()) / (2 * a);
				realNumber = -getB() / (2 * a);
				System.out.println("一元二次方程：" + getA() + "x^2+" + getB() + "x+" + getC() + "\t有两个复根：" + realNumber + "±"
						+ imaginaryNumber);
				this.hasRoot = true;
				this.rootNum = 2;
				this.firstRoot = realNumber + imaginaryNumber;
				this.secongRoot = realNumber - imaginaryNumber;
			}
		}
	}

	// 计算判别式Δ=b^2-4ac的值
	public double getDlt() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	// 求解右侧较大实根的方法
	private double getRightRoot() {
		double rightRoot = 0;
		rightRoot = (-b + Math.sqrt(getDlt())) / (2 * a);
		return rightRoot;
	}

	// 求解左侧较小实根的方法
	private double getLeftRoot() {
		double leftRoot = 0;
		leftRoot = (-b - Math.sqrt(getDlt())) / (2 * a);
		return leftRoot;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean isHasRoot() {
		return hasRoot;
	}

	public void setHasRoot(boolean hasRoot) {
		this.hasRoot = hasRoot;
	}

	public int getRootNum() {
		return rootNum;
	}

	public void setRootNum(int rootNum) {
		this.rootNum = rootNum;
	}

	public double getFirstRoot() {
		return firstRoot;
	}

	public void setFirstRoot(double firstRoot) {
		this.firstRoot = firstRoot;
	}

	public double getSecongRoot() {
		return secongRoot;
	}

	public void setSecongRoot(double secongRoot) {
		this.secongRoot = secongRoot;
	}

	public static void main(String[] args) {
		OnceBasicQuadraticEquation equation = new OnceBasicQuadraticEquation(2, -2, 1);
		System.out.println(equation.isHasRoot());
		System.out.println(equation.getRootNum());
		System.out.println(equation.getFirstRoot());
		System.out.println(equation.getSecongRoot());
	}

}
