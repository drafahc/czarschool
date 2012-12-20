package br.com.czar.school.model.beans;

import java.io.Serializable;

public class ClassePersistente implements Serializable {
	private static final long serialVersionUID = 5499508051325069239L;
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
