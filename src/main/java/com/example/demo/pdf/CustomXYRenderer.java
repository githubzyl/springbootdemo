package com.example.demo.pdf;

import java.awt.Color;
import java.awt.Paint;
import java.util.Map;

public class CustomXYRenderer
        extends org.jfree.chart.renderer.xy.XYBarRenderer {
    /** 
     *  
     */
    private static final long serialVersionUID = 784630226449158436L;

    public CustomXYRenderer() {
        super();
    }

    private Map<Integer, Paint> map = null;

    public CustomXYRenderer(Map<Integer, Paint> map) {
        this.map = map;
    }

    public static int count = 0;

    // 每根柱子以初始化的颜色不断轮循
    public Paint getItemPaint(int i, int j) {
        if (map != null) {
            return map.get(j);
        }
        return Color.BLACK;
    }

}
