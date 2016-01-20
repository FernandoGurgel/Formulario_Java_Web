package br.fucapi.model.bean;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class FabricanteBean {

	private Fabricate f = new Fabricate();
	
	

	public Fabricate getF() {
		return f;
	}



	public void setF(Fabricate f) {
		this.f = f;
	}



	public void salvar() {
		System.out.println("Chamando metodo \n"+f.getNome()+"\n"+f.getSalario()+"\n"+f.getFuncao());
	}

}
