package com.itheima.hashset;

import java.util.HashSet;

public class HashSetDemo4 {

	/*
		TREEIFY_THRESHOLD代表着阈值8

		for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p代表着当前元素p.next是获取下一个意思
                        p.next = newNode(hash, key, value, null);
                        判断binCount这个值是否大于等于这个阈值-1，为啥是-1，因为-1是不是01234567，binCount是从0开始也是01234567也是8个，
                        大于或者等于7，是1的时候操作的其实是数组中的第二个元素因为p.next获取下一个了然后到第9个元素才是第八个，
                        treeifyBin(tab, hash);就是树化操作，
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
	 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		hs.add("a");    //1
		hs.add("b");    //2
		hs.add("c");    //3
		hs.add("d");    //4
		hs.add("e");    //5
		hs.add("f");    //6
		hs.add("g");    //7
		hs.add("h");    //8
		hs.add("i");    //9
		hs.add("j");    //10
		hs.add("k");    //11
		hs.add("l");    //12
		hs.add("m");    //13


		System.out.println(hs);
	}
}
