package com.mycompany.MSA.MSA;
 
//import javax.persistence.Entity;

//@Entity
public class MSAEntity { 
  private String name;
	static public String risultato = "";
	
	public MSAEntity() {};
	
	
	public MSAEntity(String name) {
		this.name  = name;
	};

	
	/*@Bean
	public void setName(String name) {
		this.name  = name;
	}*/
	
	public String getName() {
		return this.name;
	}

	static public String getRisultato() {
		return risultato;
	}

	static public void setRisultato(String newRisultato) {
		risultato = risultato + newRisultato;
	}

}