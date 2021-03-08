package Lab_06;

class RedditCrawler extends Crawler {
	public Item[] crawl() {
		System.out.println("Crawl posts!");
		return new Item[0]; // return empty as no implementation yet
	}

	public Item[] search(String s) {
		System.out.println("Search posts: " + s);
		return new Item[0]; // return empty as no implementation yet
	}
}
