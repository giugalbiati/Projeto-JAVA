package projetoJavaB1;

import java.util.Scanner;

public abstract class Energia {

	protected String nomeEmpresa;
	protected String cnpj;
	protected float consumo;
	protected double orcamento;
	protected int regiao;
	protected float faturamento;
	protected double percAbt;

	public Energia(String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,
			double percAbt) 
	{

		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.consumo = consumo;
		this.orcamento = orcamento;
		this.regiao = regiao;
		this.faturamento = faturamento;
		this.percAbt = percAbt;

	}
	
	Scanner leia = new Scanner(System.in);

	  public void cadastroEmpresa()
	    {	      
	    }
	    
    
	abstract public void fonte (String fonte);
	abstract public void vidaUtil (int V);
	abstract public void capacidade (float capacidade);
	
	public void consumo()
	{
		if(getConsumo()<1000)
		{
			System.out.println("O consumo de energia da empresa � baixo.");
		}
		else if(getConsumo()>=1000 && getConsumo()<1500)
		{
			System.out.println("O consumo de energia da empresa � m�dio.");
		}
		else if (getConsumo()>1500)
		{
			System.out.println("O consumo de energia da empresa � alto.");
		}
	}
	
	public void verificacao()
	{
		int M=0, S=0, B=0, E=0;
		
		if (getRegiao()== 1)
		{
			S++;
		}
		else if (getRegiao()== 2)
		{
			M++; E++; S++;
		}
		else if (getRegiao()==3)
		{
			B++; S++;
		}
		else if (getRegiao()==4)
		{
			B++;
		}
		else if (getRegiao()== 5)
		{
			E++;
		}
		if (getOrcamento()>=15000 && getOrcamento()<20000 && getRegiao()==2)
		{
			M++;
		}
		else if (getOrcamento()>=20000 && getOrcamento()<25000 && getRegiao()==1)
		{
			S++;
		}
		else if (getOrcamento()>=25000 && getOrcamento()<30000 && getRegiao()==3 || getRegiao()==4)
		{
			B++;
		}
		else if (getOrcamento()>30000 && getRegiao()==2 || getRegiao()==5)
		{
			E++;
		}
		else if(getConsumo()<1000)
		{
			S++;
		}
		else if(getConsumo()>=1000 && getConsumo()<1500)
		{
			E++;
		}
		else if (getConsumo()>1500 && getRegiao()==2)
		{
			M++;
		}
		else if (getConsumo()>1500)
		{
			B++;
		}
		
		if(S>B && S>E && S>M)
		{
			System.out.println("A energia solar � a mais indicada.");
		}
		else if(B>S && B>E && B>M)
		{
			System.out.println("A energia biomassa � a mais indicada.");
		}
		else if(E>B && E>S && E>M)
		{
			System.out.println("A energia e�lica � a mais indicada.");
		}
		else if(M>B && M>E && M>S)
		{
			System.out.println("A energia maremotriz � a mais indicada.");
		}
		
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

	public int getRegiao() {
		return regiao;
	}

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) {
		this.faturamento = faturamento;
	}

	public double getPercAbt() {
		return percAbt;
	}

	public void setPercAbt(double percAbt) {
		this.percAbt = percAbt;
	}

}