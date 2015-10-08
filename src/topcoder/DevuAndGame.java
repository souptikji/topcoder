package topcoder;

import java.util.ArrayList;
import java.util.List;

public class DevuAndGame
	{
		public String canWin(int[] nextLevel)
		{
			List<Integer> exitFound = new ArrayList<Integer>();
			for(int i=0;i<nextLevel.length;++i)
				{
					if(nextLevel[i]==-1)
						{
							exitFound.add(nextLevel[i]);
						}
				}
			if(exitFound.size()!=0)
				{
					for(int i=0;i<nextLevel.length;++i)
						{
							if(exitFound.contains(nextLevel[i]))
								{
									return("Win");
								}
						}
				}
			return("Lose");
		}

	}
