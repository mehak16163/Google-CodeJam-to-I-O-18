import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class q1 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(rd.readLine());
		for (int i=1;i<=test;i++){
			int k = Integer.parseInt(rd.readLine());
			String[] di = rd.readLine().split(" ");
			int[] dis = new int[k];
			for (int j =0 ;j<k;j++){
				dis[j]= Integer.parseInt(di[j]);
			}
			System.out.print("Case #"+i+": ");

			Arrays.sort(dis);
			int j = k-1;
			boolean[] placed = new boolean[k];
			int[] place = new int[k];
			boolean[] check = new boolean[k]; 
			int ans = 0;
			int l=0;
			if (k%2==0){
				while(l<k/2){
					ans  =ans + (int)Math.pow((((k-1)/2)-l - dis[j]),2);
					j--;
					ans = ans + (int)Math.pow((k-1)/2 -l -dis[j],2);
					j--;
					l++;
				}
			}
			else{
				ans = ans + (int)Math.pow((k/2 - dis[j]),2);
				j--;
				l=1;
				//System.out.println(ans);
				while (l<=k/2){
					ans = ans + (int )Math.pow((k/2)-l - dis[j],2);
					//System.out.println(ans);
					j--;
					ans = ans + (int)Math.pow((k/2) -l - dis[j],2);
					j--;
					l++;
					//System.out.println(ans);
				}
			}
			System.out.println(ans);
		}
	}
}
