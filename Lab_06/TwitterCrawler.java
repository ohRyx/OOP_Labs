package Lab_06;

class TwitterCrawler extends Crawler {
	public Item[] crawl() {
		System.out.println("Crawl tweets!");
		return new Item[0]; // return empty as no implementation yet
	}

	public Item[] search(String s) {
		System.out.println("Search tweets: " + s);
		return new Item[0]; // return empty as no implementation yet
	}
}
