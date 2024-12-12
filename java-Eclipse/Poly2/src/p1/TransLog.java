package p1;
import java.util.*;
public  final class TransLog 
{
      private final long haccno,baccno;
      private final float amt;
      private final Date dtime;
      
      public TransLog(long haccno,long baccno,float amt,Date dtime)
      {
    	  this.haccno=haccno;
    	  this.baccno=baccno;
    	  this.amt=amt;
    	  this.dtime=dtime;
      }

	public final long getHaccno() {
		return haccno;
	}

	public final long getBaccno() {
		return baccno;
	}

	public final float getamt() {
		return amt;
	}

	public final Date getdtime() {
		return dtime;
	}
      
}
