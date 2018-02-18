import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class q2 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(rd.readLine());
		for (int i=1;i<=test;i++){
			int  l = Integer.parseInt(rd.readLine());
			HashMap<Long,Long> hm = new HashMap<Long, Long>();
			long[] nums = new long[l];
			long[] exps =  new long[l];
			long total = 0;
			for (int j=0;j<l;j++){
				String[] c = rd.readLine().split(" ");
				long num = Long.parseLong(c[0]);
				long exp = Long.parseLong(c[1]);
				nums[j] = num;
				exps[j] = exp;
				hm.put(exp ,  (long)j);
			}
			long tot  = 0;
			long max = exps[l-1];
			Arrays.sort(exps);
			for (int j=0;j<=l-1;j++){
				long index = hm.get(exps[j]);
				long no = nums[(int)index];
				tot = Math.max(0 ,  tot - (no *exps[j]));
				tot = tot + no;
				//System.out.println(tot);
				
			}
			System.out.print("Case #"+i+": ");
			System.out.println(Math.max(max+1 , tot));
		}
	}
}
