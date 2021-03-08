package Lab_06;

abstract class Crawler implements Searchable {
	private String baseUrl;

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public abstract Item[] crawl();
}