package topcoder;
import java.math.*;

public class BearPaints
	{
		public long maxArea(int W, int H, long M)
		{
			//x<=W && y<=H; x*y=M; maximize x*y
			double sqrt=Math.sqrt((double)M);
			if(M>W*H)
				{
					return(W*H);
				}
			else
				{
					long x = (long) Math.floor(sqrt);
					long y=
				}
		}

	}
