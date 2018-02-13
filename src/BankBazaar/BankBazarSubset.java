//1. Program related to Find max count
//2. Find local max in subset of given size
/*
static int globalMax=0;
static void combinationUtil(int arr[], int data[], int start,
        int end, int index, int r)
        {
        if (index == r)
        {
        int locDiff=Integer.MAX_VALUE;
        for (int j=1; j<r; j++){
        int diff=Math.abs(data[j-1]-data[j]);
        if(diff<locDiff)
        locDiff=diff;
        }
        if(locDiff>globalMax)
        globalMax=locDiff;
        return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
        data[index] = arr[i];
        combinationUtil(arr, data, i+1, end, index+1, r);
        }

        }

static int findMaximum(int[] a, int m) {
        int data[]=new int[m];
        int max=0;
        combinationUtil(a, data, 0, a.length-1, 0, m);
        return globalMax;
        }*/
