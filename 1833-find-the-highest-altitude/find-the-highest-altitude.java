class Solution {
    public int largestAltitude(int[] gain) {
        int MaxAltitude=0;
        int CurrentAltitude=0;
        for(int i=0;i<gain.length;i++)
        {
            CurrentAltitude+=gain[i];
            MaxAltitude=Math.max(CurrentAltitude,MaxAltitude);

        }
        return MaxAltitude;
        
    }
}