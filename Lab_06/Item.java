package Lab_06;

public class Item {
	private String title;
	private String content;
	private String url;

	public Item() {
		super();
	}

	public Item(String title, String content, String url) {
		super();
		this.title = title;
		this.content = content;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
