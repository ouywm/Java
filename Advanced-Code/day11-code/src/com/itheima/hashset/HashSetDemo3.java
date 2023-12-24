package com.itheima.hashset;

import java.util.HashSet;

public class HashSetDemo3 {
	/*
        桶下标(索引)的计算

		int aHash = "a".hashCode() ^ ("a".hashCode() >>> 16);
						原始哈希            扰动哈希
							  做异或获得二次哈希
						获取原始哈希，拿着原始哈希向右移动16位，然后跟原始哈希去做异或，这样得出来的
						哈希值，就可以减少重复，因为向右移动了，把高位往右边移动了，就把低位的给移了出去，
						然后通过算法，算出来哈希值

		System.out.println(aHash % 16);
					刚算出来的哈希值去%数组的长度，这个16代表底层的数组长度，table

		System.out.println((16 - 1) & aHash);
					这样计算出来的结果跟拿着哈希值%数组的长度是一样的
     */
	public static void main(String[] args) {
		int aHash = "a".hashCode() ^ ("a".hashCode() >>> 16);
		System.out.println(aHash % 16);
		System.out.println((16 - 1) & aHash);

		int bHash = "b".hashCode() ^ ("b".hashCode() >>> 16);
		System.out.println(bHash % 16);
		System.out.println((16 - 1) & bHash);

		int cHash = "c".hashCode() ^ ("c".hashCode() >>> 16);
		System.out.println(cHash % 16);
		System.out.println((16 - 1) & cHash);

		int pHash = "p".hashCode() ^ ("p".hashCode() >>> 16);
		System.out.println(pHash % 16);
		System.out.println((16 - 1) & pHash);

		int qHash = "q".hashCode() ^ ("q".hashCode() >>> 16);
		System.out.println(qHash % 16);
		System.out.println((16 - 1) & qHash);

		HashSet<String> hs = new HashSet<>();
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("p");
		hs.add("q");

		System.out.println(hs);}
}
