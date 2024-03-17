class Solution:
    # @return a list of lists of length 3, [[val1,val2,val3]]
    def threeSum(self, num):
        
        res = []
        N = len(num)
        d = {}
        for i in range(N):
            d[num[i]] = 1
        num.sort()                          # Quick or Merge sort, O(N lg N)

  
        for i in range(0, N-2):           # for i = 0 to N-3
            for j in range(i+1, N-1):       # for j = i+1 to N-2
                val = -(a[i] + a[j])
                if num[i] < num[j] < val and val in d:
                    res.append( [num[i], num[j], val] )
        return res