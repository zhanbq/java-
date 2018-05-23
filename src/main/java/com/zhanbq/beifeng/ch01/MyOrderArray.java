﻿package com.zhanbq.beifeng.ch01;

public class MyOrderArray {
	private long[] arr;
	//表示有效数据的长度
	private int elements;
	
	public MyOrderArray() {
		arr = new long[50];
	}
	
	public MyOrderArray(int maxsize) {
		arr = new long[maxsize];
	}
	
	/**
	 * 添加数据
	 */
	public void insert(long value) {
		int i;
		for(i = 0; i < elements; i++) {
			if(arr[i] > value) { //如果数组中第i个位置的值 大于参数value 就让出这个位置向后移
				break;
			}
		}
		
		for(int j = elements; j > i; j--) {
			arr[j] = arr[j - 1];
		}
		arr[i] = value;
		elements++;
	}
	
	/**
	 * 显示数据
	 */
	public void display() {
		System.out.print("[");
		for(int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	/**
	 * 查找数据 
	 */
	public int search(long value) {
		int i;
		for(i = 0; i < elements; i++) {
			if(value == arr[i]) {
				break;
			}
		}
		
		if(i == elements) {
			return -1;
		} else {
			return i;
		}
		
	}
	
	/**
	 * 二分法查找数据 -->>  二分法查找(前提 是 必须是有序数组)
	 */
	public int binarySearch(long value) {
		int middle = 0;
		int low = 0; //起始位置 第0位
		int pow = elements; //最后一位
		
		while(true) {
			middle = (pow + low) / 2;
			if(arr[middle] == value) {
				return middle;
			} else if(low > pow) {
				return -1;
			} else {
				if(arr[middle] > value) {
					pow = middle - 1;
				} else {
					low = middle + 1;
				}
			}
		}
	}
	
	
	/**
	 * 查找数据，根据索引来查
	 */
	public long get(int index) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}
	
	/**
	 * 删除数据
	 */
	public void delete(int index) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for(int i = index; i < elements; i++) {
				arr[index] = arr[index + 1];
			}
			elements--;
		}
	}
	
	/**
	 * 更新数据
	 */
	public void change(int index, int newvalue) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index] = newvalue;
		}
	}
}
