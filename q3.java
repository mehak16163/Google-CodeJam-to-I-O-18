import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class q3 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(rd.readLine());
		for (int i=1;i<=test;i++){
			int l = Integer.parseInt(rd.readLine());
			String[] c =rd.readLine().split(" ");
			System.out.print("Case #"+i+": ");
			for (int j=0;j<3;j++){
				for (int k=0;k<l;k++){
					char at = c[j].charAt(k);
					if (c[0].charAt(k)==at && c[1].charAt(k)==at && c[2].charAt(k)==at){
						continue;
					}
					else if (c[0].charAt(k)!= c[1].charAt(k) && c[0].charAt(k)!= c[2].charAt(k) && c[2].charAt(k)!= c[1].charAt(k)){
						System.out.print("YES ");
						break;
					}
					else{
						boolean[] in = new boolean[3];
						char[] chars = new char[2];
						chars[0]=  at;
						int count =0;
						int i1=-1, i2=-1;
						if (c[0].charAt(k)==at){
							count++;
							in[0]= true;
							if (i1 ==-1){
								i1=0;
							}
							else i2=0;
						}
						else{
							chars[1]= c[0].charAt(k);
						}
						if (c[1].charAt(k)==at){
							count++;
							in[1]= true;
							if (i1 ==-1){
								i1=1;
							}
							else i2=1;
						}
						else{
							chars[1]= c[1].charAt(k);
						}
						if (c[2].charAt(k)==at){
							count++;
							in[2]= true;
							if (i1 ==-1){
								i1=2;
							}
							else i2=2;
						}
						else{
							chars[1]= c[2].charAt(k);
						}
						boolean cont = true;
						if (count==1){
							System.out.print("NO ");
							break;
						}
						else{
							while(k+1<l){
								if (c[i1].charAt(k+1)==c[i2].charAt(k+1)){
									k++;
								}
								else{
									if ((c[i1].charAt(k+1)==chars[0] &&c[i2].charAt(k+1)==chars[1])){
										if(i2==j){
											System.out.print("YES ");
										}
										else{
											System.out.print("NO ");
										}
										cont = false;
										break;
									}
									if((c[i1].charAt(k+1)==chars[1] &&c[i2].charAt(k+1)==chars[0])) {
										if(i1==j){
											System.out.print("YES ");
										}
										else{
											System.out.print("NO ");
										}
										cont = false;
										break;
									}
									
									System.out.print("YES ");
									cont = false;
									break;
								}
								
							}
						}
						if (!cont){
							break;
						}
					}
				}
			}
			System.out.println();
		}
	}
}
