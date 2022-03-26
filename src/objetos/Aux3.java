package objetos;

import java.util.Set;

public class Aux3 {

	String propTirada;
	Set<String> copiaSetProps;
	
	public Aux3() {
		
	}
	
	public Aux3(String propTirada, Set<String> copiaSetProps) {
		this.propTirada = propTirada;
		this.copiaSetProps = copiaSetProps;
	}
	
	public String getPropTirada() {
		return propTirada;
	}
	public void setPropTirada(String propTirada) {
		this.propTirada = propTirada;
	}
	public Set<String> getCopiaSetProps() {
		return copiaSetProps;
	}
	public void setCopiaSetProps(Set<String> copiaSetProps) {
		this.copiaSetProps = copiaSetProps;
	}
}
