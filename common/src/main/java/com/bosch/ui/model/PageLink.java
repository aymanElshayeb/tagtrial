package com.bosch.ui.model;

import java.util.LinkedList;
import java.util.List;

public class PageLink {
	private String text;
	private String url;
	public PageLink(String text, String url) {
		setText(text);
		setUrl(url);
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	static public List<PageLink> getPageLinks(String linkTexts, String linkURLs) {
		
		List<PageLink> pageLinkList  = new LinkedList<PageLink>();
		
		
		if((linkTexts ==null)||(linkTexts.length()==0)) {
			return pageLinkList; 
		}
		String[] pageLinkText =linkTexts.split(",");
		String[] pageLinkUrl = null;
		
		if((linkURLs !=null)&&(linkURLs.length()>0)) {
			pageLinkUrl = linkURLs.split(",");
		}
		
		for(int i=0;i<pageLinkText.length ;i++) {
			
			String text = pageLinkText[i];
			String url = "";
			if(pageLinkUrl!=null && i<pageLinkUrl.length) {
				 url =pageLinkUrl[i];
			}
			
			PageLink pageLink = new PageLink(text,url);
			pageLinkList.add(pageLink);
		}
		
		return pageLinkList;
	}
	/*	
static public List<String> getPageLinks(String linkTexts, String linkURLs) {
		
		List<String> pageLinkList  = new LinkedList<String>();
		
		
		if((linkTexts ==null)||(linkTexts.length()==0)) {
			return pageLinkList; 
		}
		String[] pageLinkText =linkTexts.split(",");
		String[] pageLinkUrl = null;
		
		if((linkTexts ==null)||(linkTexts.length()==0)) {
			pageLinkUrl = linkURLs.split(",");
		}
		
		for(int i=0;i<pageLinkText.length ;i++) {
			
			String text = pageLinkText[i];
			String url = "";
			if(pageLinkUrl!=null && i<pageLinkUrl.length) {
				 url =pageLinkUrl[i];
			}
			
			PageLink pageLink = new PageLink(text,url);
			pageLinkList.add(text);
		}
		
		return pageLinkList;
	}
*/
}
