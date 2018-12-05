# Sorting
Implement 10 classical sorting algorithms

## Bubble Sort
- O(n^2)
- stable

比较两个相邻的元素，将值大的元素交换至右端。

## Heap Sort
- O(nlogn)
- unstable

堆是具有以下性质的完全二叉树：每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆；或者每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆。


基本思想：将待排序序列构造成一个大顶堆，此时，整个序列的最大值就是堆顶的根节点。将其与末尾元素进行交换，此时末尾就为最大值。然后将剩余n-1个元素重新构造成一个堆，这样会得到n个元素的次小值。如此反复执行，便能得到一个有序序列了

reference:
https://www.cnblogs.com/chengxiao/p/6129630.html

## Straight Insertion Sort
每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
- best: O(n), worst: O(n^2)
- stable

## Merge Sort
- nlog(n)
- stable

## Quick Sort

选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分

- O(n^2)
- unstable

## Radix Sort 基数排序 
基数排序(Radix Sort)是桶排序的扩展，它的基本思想是：将整数按位数切割成不同的数字，然后按每个位数分别比较。
具体做法是：将所有待比较数值统一为同样的数位长度，数位较短的数前面补零。然后，从最低位开始，依次进行一次排序。这样从最低位排序一直到最高位排序完成以后, 数列就变成一个有序序列。
- O(n * digit)
- stable

## Selection Sort 
在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
- O(n^2)
- unstable

## Shell Sort
- O(nlogn)
- unstable

# Reference
- Python: https://www.cnblogs.com/woider/p/6835466.html 

    https://blog.csdn.net/aiya_aiya_/article/details/79846380
