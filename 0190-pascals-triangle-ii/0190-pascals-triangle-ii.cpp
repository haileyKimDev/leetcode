class Solution {
public:
    vector<int> getRow(int rowIndex) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        vector<int> ret;
        if(rowIndex<=0) return ret;
        ret.resize(rowIndex);
        ret[0] = 1;
        for(int r=1; r<rowIndex; r++){
            for(int c=r; c>0; c--){
                if(c==r) ret[c] = ret[c-1];
                else
                    ret[c] = ret[c] + ret[c-1];
            }
        }
        return ret;
    }
};