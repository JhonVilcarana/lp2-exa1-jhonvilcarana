package pe.edu.upeu.entity;

public class usuario {
	private int idusuario;
	private String nomuser;
	private String clave;
	private int idpersonas;
	public usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public usuario(int idusuario, String nomuser, String clave, int idpersonas) {
		super();
		this.idusuario = idusuario;
		this.nomuser = nomuser;
		this.clave = clave;
		this.idpersonas = idpersonas;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomuser() {
		return nomuser;
	}
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getIdpersonas() {
		return idpersonas;
	}
	public void setIdpersonas(int idpersonas) {
		this.idpersonas = idpersonas;
	}

}
