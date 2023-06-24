import java.util.Arrays;

class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
		int[] temp = new int[n+1];
		int max=0;
		int m=0;
		
		int j=1;
		for(int i=0;i<n;i++)
		{
			temp[j] = temp[i]+gain[i];
			++j;
		}
		Arrays.sort(temp);
		return temp[n];
    }
}
