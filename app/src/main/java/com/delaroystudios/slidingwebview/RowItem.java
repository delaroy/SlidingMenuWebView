package com.delaroystudios.slidingwebview;

public class RowItem {

	private String title;
	private int icon;
	private String pageUrl;

	public RowItem(String title, int icon, String pageUrl) {
		this.title = title;
		this.icon = icon;
		this.pageUrl = pageUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

}
