package com.zhanbq.beifeng.ch02;

/**
 * 冒泡排序
 * @author zhanbq/zhanbq@lianjintai.com
 * @version 
 * @date   2017年3月21日 下午4:46:07
 */
public class BubbleSort {
	
	public static void sort(long[] arr) {
		long tmp = 0;
		for(int i = 0; i < arr.length - 1; i++) {  //次数
			for(int j = arr.length - 1; j > i; j--) { 
				if(arr[j] < arr[j - 1]) {
					//进行交换
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
}
