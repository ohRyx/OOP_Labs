package Lab_06;

class StorageHandler implements Searchable {
	public Item[] search(String s) {
		System.out.println("Search files: " + s);
		return new Item[0]; // return empty as no implementation yet
	}
}
