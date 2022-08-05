package vilao;

public class Vilao {
	
	private String identidadeSecreta;
	private String universoPertence; //(marvel, dc..)
	private String nomeDeVilao;
	private String planetaNatal;
	private String pertenceAoGrupoLiga; //(liga da justiça, os batutinhas...)
	private String cidadeNatal; //(gothan, sambariSeive me...)
	private String baseSecreta; //(bat caverna, planeta diario...)
	private String superPoderes; //(raio-x, ser rico)
	private int idade; //(25 , indefinido)
	private boolean estaNaAtiva; //(verdadeiro ou Falso)
	
	public Vilao() {
		
	}

	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}

	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}

	public String getUniversoPertence() {
		return universoPertence;
	}

	public void setUniversoPertence(String universoPertence) {
		this.universoPertence = universoPertence;
	}

	public String getNomeDeVilao() {
		return nomeDeVilao;
	}

	public void setNomeDeVilao(String nomeDeHeroi) {
		this.nomeDeVilao = nomeDeHeroi;
	}

	public String getPlanetaNatal() {
		return planetaNatal;
	}

	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}

	public String getPertenceAoGrupoLiga() {
		return pertenceAoGrupoLiga;
	}

	public void setPertenceAoGrupoLiga(String pertenceAoGrupoLiga) {
		this.pertenceAoGrupoLiga = pertenceAoGrupoLiga;
	}

	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public String getBaseSecreta() {
		return baseSecreta;
	}

	public void setBaseSecreta(String baseSecreta) {
		this.baseSecreta = baseSecreta;
	}

	public String getSuperPoderes() {
		return superPoderes;
	}

	public void setSuperPoderes(String superPoderes) {
		this.superPoderes = superPoderes;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getEstaNaAtiva() {
		return estaNaAtiva;
	}

	public void setEstaNaAtiva(boolean estaNaAtiva) {
		this.estaNaAtiva = estaNaAtiva;
	}
	
	@Override
	public String toString() {

		return "Vilão: " + nomeDeVilao + "\nUniverso: " + universoPertence + "\nPlaneta Natal: " + planetaNatal   + "\nGrupo: " + pertenceAoGrupoLiga + "\nIdade: " + idade/*  + "\nEsta Ativo: " + estaNaAtiva*/;
	}
	

}
