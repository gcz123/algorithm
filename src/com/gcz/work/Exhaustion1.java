package com.gcz.work;

public class Exhaustion1 {
    /**
     * 百钱买百鸡
     *问题描述：
     * 一个鸡贩子摊上的 公鸡 5文钱一只
     *                母鸡 3文钱一只
     *                鸡雏 一文钱3只
     *一个客户想用一百文钱买一百只鸡
     * 算出此客户有几种买法
     *
     *解决问题所用：穷举法，尝试每种有可能的方法
     * 设 公鸡 x只 母鸡 y只 鸡雏 (100-x-y) 共一百只
     *    则 5*x+y*3+(100-x-y)/3 == 100 文钱
     *    且 0<x<20 0<y<33
     * */

    public static void main(String[] args) {
        for(int x=0;x<20;x++){
            for(int y=0;y<33;y++){
                if(5*x+3*y+(100-x-y)/3==100){
                    System.out.println("公鸡："+x+"---母鸡："+y+"---鸡雏"+(100-x-y));
                }
            }
        }
    }
}
