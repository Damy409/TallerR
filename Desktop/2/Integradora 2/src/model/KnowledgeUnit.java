package model;

public class KnowledgeUnit {

	private String identificacion;
	private String descripcionn;
	private String tipo;
	private String leccion;
	private String status;

	public KnowledgeUnit(String identicacion, String descripcionn, String tipo, String leccion, String status) {

		this.identificacion = identicacion;
		this.descripcionn = descripcionn;
		this.tipo = tipo;
		this.leccion = leccion;
		this.status = status;
	}

		//Getters and Setters 

		public String getIdentificacion() {
			return identificacion;
		}
	
		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}
	
		public String getDescripcionn() {
			return descripcionn;
		}
	
		public void setDescripcionn(String descripcionn) {
			this.descripcionn = descripcionn;
		}
	
		public String getTipo() {
			return tipo;
		}
	
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	
		public String getLeccion() {
			return leccion;
		}
	
		public void setLeccion(String leccion) {
			this.leccion = leccion;
		}


		public void setStatus(String status){
			this.status = status;
		}

		public String toString(){
	
			String msg = "";
	
			msg = "\nIdentificacion:" +identificacion+ "\nDescripcion: "+descripcionn+ "\nTipo:" +tipo+ "\nLeccion:" +leccion + "\nStatus:" +status;
	
			return msg;
		}
	

}

