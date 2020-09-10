package br.com.cetaceo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "ctrprofile")
@Getter @Setter
public class Profile implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	
	@Override
	public String getAuthority() {
		return "ROLE_".concat(this.name);
	}
}
