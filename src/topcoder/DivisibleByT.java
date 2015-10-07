package topcoder;

import java.io.BufferedReader;
import java.util.Scanner;

public class DivisibleByT
	{
		public static void main(String[] args)
		{
			int n,t;
			for(int i=0;i<100;++i)
				{
					Scanner in = new Scanner(System.in);
					n=in.nextInt();
					t=in.nextInt();
					String answer = findAnswer(n, t);
					if(answer=="Invalid args"|answer=="Cannot be formed") System.out.println("-1");
					else System.out.println(answer);
				}
			
		}

		private static String findAnswer(int n, int t)
			{
				if(t>=1&&t<10) return divbyT(n,t);
				
				else if(t==10) return divby10(n);
				else return("Invalid args");
				
			}

		private static String divby10(int n)
			{
				StringBuilder sb = new StringBuilder();
				sb.append('0');
				for(int i=0;i<n-1;++i)
					{
						sb.append(1);
					}
				sb.reverse();
				if(sb.toString().equals("0")) return("Cannot be formed");
				else return sb.toString();			}

		
		private static String divbyT(int lengthOfAns,int numberToBeAppended)
			{
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<lengthOfAns;++i)
					{
						sb.append(numberToBeAppended);
					}
				return sb.toString();
			}

			}
