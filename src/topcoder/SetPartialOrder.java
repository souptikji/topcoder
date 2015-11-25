package topcoder;

import java.util.Arrays;

public class SetPartialOrder
	{
		public String compareSets(int[] a, int[] b)
		{
			
			//Sort both
			Arrays.sort(a);
			Arrays.sort(b);
			
			//if both are of equal length then all elements should be same correspondingly
			if(a.length==b.length)
				{
					if(Arrays.equals(a, b)) return ("EQUAL");
					else return("INCOMPARABLE");
				}
			
			//if A is larger array then check for B to be subset of A
			else if(a.length>b.length)
				{
					for(int i=0;i<b.length;++i)
						{
							if(Arrays.binarySearch(a, b[i])<0)
								{
									return("INCOMPARABLE");
								}
						}
					return("GREATER");
				}
			
			//if B is larger array then check for A to be subset of B
			else 
				{
					for(int i=0;i<a.length;++i)
						{
							if(Arrays.binarySearch(b, a[i])<0)
								{
									return("INCOMPARABLE");
								}
						}
					return("LESS");
				}
		}

	}
