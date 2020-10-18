package Samples;

import java.util.ArrayList;
import java.util.List;

class BitwiseCompliment {
    public int bitwiseComplement(int N) {
        if(N==0) return 1;
        List<Integer> arr = new ArrayList<Integer>();
        while(N>0) {
            int k = N%2;
            if(k==0)
                arr.add(1);
            else
                arr.add(0);
            N = N/2;
        }
        int sum=0;
        for(int i=0;i<arr.size();i++) {
            sum += ((int)Math.pow(2,i))*(int)arr.get(i);
        }
        return sum;
        
    }
}