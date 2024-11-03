package com.learningwithak.leetcode.most_asked_question.merged_sorted_array;

import java.util.Arrays;

public class MergedSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m=3, n=3;
       merge(num1, m, num2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i]=nums2[j];
            i++;
        }
        //Arrays.sort(nums1);
        Arrays.stream(nums1).sorted().forEach(System.out::print);
    }
}

