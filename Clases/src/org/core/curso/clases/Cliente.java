	package org.core.curso.clases;
	
	public class Cliente extends Persona {
		private String telefonoContacto;
		
		
		
		@Override
		public void mostrar() {
			// TODO Auto-generated method stub
			super.mostrar();
			System.out.println("\tTelefono: " + getTelefonoContacto());
		}
		public Cliente(String nombre, int edad,
				String password, String	telefonoContacto) {
			super(nombre, edad, password);
			this.telefonoContacto = telefonoContacto;
		}			
			public Cliente() {
				super();
				this.telefonoContacto = "TBD";
				
				
			}
			public String getTelefonoContacto() {
				return telefonoContacto;
			}
			public void setTelefonoContacto(String telefonoContacto) {
				this.telefonoContacto = telefonoContacto;
			}
		}
