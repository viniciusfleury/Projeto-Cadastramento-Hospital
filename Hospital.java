public final class Hospital {
	public static Hospital instancia;
	String nome;
	String endereco;
	private Hospital() {
		nome = "Heavens Touch";
		endereco = "Av. Salvação, Setor Celestial";
	}
	public static Hospital getInstancia() {
		if(instancia == null) instancia = new Hospital();
		return instancia;
	}
}