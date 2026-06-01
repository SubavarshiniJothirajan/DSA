/*
Given an array arr[] of integers, where each element arr[i] represents the number of pages in the i-th book.
You also have an integer k representing the number of students. The task is to allocate books to each student such that:

Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
All books must be allocated.
The objective is to minimize the maximum number of pages assigned to any student. In other words, 
out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.

Note: If it is not possible to allocate books to all students, return -1.
*/class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int max = -1,sum=0;
        if(k>arr.length)
        return -1;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(arr[i],max);
            sum+=arr[i];
        }
        int low = max,high = sum;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(canAllocate(arr,mid)>k){
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return low;
    }
    public static int canAllocate(int[] arr,int pages)
    {
        int stud = 1,studPages = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(studPages+arr[i]<=pages)
            {
                studPages+=arr[i];
            }
            else
            {
                stud++;
                studPages = arr[i];
            }
        }
        return stud;
    }
}
