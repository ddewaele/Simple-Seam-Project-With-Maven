package be.ecs.seamdemo.beans;

import org.jboss.seam.annotations.Name;

@Name("dataHolder")
public class DataHolder {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
