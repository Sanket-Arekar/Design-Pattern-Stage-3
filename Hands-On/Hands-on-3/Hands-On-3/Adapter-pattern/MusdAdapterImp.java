
public class MusdAdapterImp implements Meuro {
	private Musd usd;
	
	public double getCurr() {
		return convertUSDtoEURO(usd.getCurr());
	}
	
	private double convertUSDtoEURO(double cur) {
        return cur * 0.924967;
    }

	public MusdAdapterImp(Musd usd) {
		super();
		this.usd = usd;
	}
}
