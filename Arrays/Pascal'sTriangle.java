class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(numRows>=1)
            result.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows>=2)
            result.add(new ArrayList<>(Arrays.asList(1,1)));
        for(int i=2;i<numRows;i++)
        {
            List<Integer> list = new ArrayList<>();
            list.add(1);
           Integer[] arr = result.get(result.size()-1).toArray(new Integer[0]);
            
            for(int j=1;j<arr.length;j++)
            {
                int a = arr[j-1];
                int b = arr[j];
                int c = a+b;
                list.add(c);
            }
            list.add(1);
            result.add(list);

        }
        return result;
    }
}
