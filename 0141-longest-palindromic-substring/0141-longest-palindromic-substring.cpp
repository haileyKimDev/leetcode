class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.size();
        
        if (n == 0) return "";
        
        int max = 0, maxS = 0, maxE = 0;
        vector<vector<bool> > table(n, vector<int>(n, false));
        
        for (int i=0; i<n; ++i)
            for (int j=0; j<=i; ++j) {
                if (j == i)
                    table[i][j] = true;
                else {
                    if (i-1 <= j+1)
                        table[i][j] = table[i-1][j+1] && s[i] == s[j];
                    else
                        table[i][j] = (s[i] && s[j]);
                        
                    if (table[i][j] && i-j+1 > max) {
                        max = i-j+1;
                        maxS = j;
                        maxE = i;
                    }
                }
            }
            
        return s.substr(maxS, maxE-maxS+1);
    }
};