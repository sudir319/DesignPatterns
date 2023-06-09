package patterns.structural.adapter.solution;

public class StockMarketAdapter implements CSVParser {

	private StockMarketDataParser stockMarketDataParser;
	
	public StockMarketAdapter(StockMarketDataParser stockMarketDataParser) {
		this.stockMarketDataParser = stockMarketDataParser;
	}
	
	@Override
	public void parseCSV() {
		stockMarketDataParser.parseXML();
	}
}
