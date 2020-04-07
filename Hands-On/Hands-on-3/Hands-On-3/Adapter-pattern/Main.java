import static org.junit.Assert.*;

import org.junit.Test;

public class Main {
	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
	    Movable bugattiVeyron = new BugattiVeyron();
	    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
	  
	    assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	
	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
	    Musd us = new CurrUSD();
	    Meuro usAdapter = new MusdAdapterImp(us);
	  
	    assertEquals(usAdapter.getCurr(), 46.24835, 0.00001);
	}
}
