package com.neil.javaleetcode.q0100_0199.q0134_gas_station;
class gas_station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length!=cost.length) return -1;
        int sum=0,total=0,index=0;
        for(int i=0;i<gas.length;i++){
            int sy = gas[i] - cost[i];
            sum+= sy;
            total+= sy;
            if(sum<0){
                index=i+1;
                sum=0;
            }
        }
        if(total<0) return -1;
        return index;
    }
}
