# Sorting
Implement 10 classical sorting algorithms in Java

## Bubble Sort
- O(n^2), stable

比较两个相邻的元素，将值大的元素交换至右端。

## Heap Sort
- O(nlogn), unstable
- 堆是具有以下性质的完全二叉树：每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆；或者每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆。


基本思想：将待排序序列构造成一个大顶堆，此时，整个序列的最大值就是堆顶的根节点。将其与末尾元素进行交换，此时末尾就为最大值。然后将剩余n-1个元素重新构造成一个堆，这样会得到n个元素的次小值。如此反复执行，便能得到一个有序序列了

reference:
https://www.cnblogs.com/chengxiao/p/6129630.html

## Straight Insertion Sort
每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
- best: O(n), worst: O(n^2)
- Stable

## Merge Sort
- nlog(n)
- stable