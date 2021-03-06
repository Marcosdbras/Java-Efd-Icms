/**
 * 
 */
package br.com.samuelweb.efd.icms.registros;

import br.com.samuelweb.efd.icms.registros.bloco0.Bloco0;
import br.com.samuelweb.efd.icms.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoD.BlocoD;
import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.registros.blocoG.BlocoG;
import br.com.samuelweb.efd.icms.registros.blocoH.BlocoH;
import br.com.samuelweb.efd.icms.registros.blocoK.BlocoK;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBloco0;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBloco1;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBlocoC;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBlocoD;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBlocoE;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBlocoG;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBlocoH;
import br.com.samuelweb.efd.icms.registros.contadores.ContadoresBlocoK;

/**
 * @author Samuel Oliveira
 *
 */
public class EfdIcms {
	
	private Bloco0 bloco0;
	private Bloco1 bloco1;
	private Bloco9 bloco9;
	private BlocoC blocoC;
	private BlocoD blocoD;
	private BlocoE blocoE;
	private BlocoG blocoG;
	private BlocoH blocoH;
	private BlocoK blocoK ;
	
	private ContadoresBloco0 contadoresBloco0;
	private ContadoresBlocoC contadoresBlocoC;
	private ContadoresBlocoD contadoresBlocoD;
	private ContadoresBlocoE contadoresBlocoE;
	private ContadoresBlocoG contadoresBlocoG;
	private ContadoresBlocoH contadoresBlocoH;
	private ContadoresBlocoK contadoresBlocoK;
	private ContadoresBloco1 contadoresBloco1;
	
	/**
	 * 
	 */
	public EfdIcms() {
		this.contadoresBloco0 = new ContadoresBloco0();
		this.contadoresBlocoC = new ContadoresBlocoC();
		this.contadoresBlocoD = new ContadoresBlocoD();
		this.contadoresBlocoE = new ContadoresBlocoE();
		this.contadoresBlocoG = new ContadoresBlocoG();
		this.contadoresBlocoH = new ContadoresBlocoH();
		this.contadoresBlocoK = new ContadoresBlocoK();
		this.contadoresBloco1 = new ContadoresBloco1();
	}
	
	/**
	 * @return the bloco0
	 */
	public Bloco0 getBloco0() {
		return bloco0;
	}
	/**
	 * @param bloco0 the bloco0 to set
	 */
	public void setBloco0(Bloco0 bloco0) {
		this.bloco0 = bloco0;
	}
	/**
	 * @return the bloco1
	 */
	public Bloco1 getBloco1() {
		return bloco1;
	}
	/**
	 * @param bloco1 the bloco1 to set
	 */
	public void setBloco1(Bloco1 bloco1) {
		this.bloco1 = bloco1;
	}
	/**
	 * @return the bloco9
	 */
	public Bloco9 getBloco9() {
		return bloco9;
	}
	/**
	 * @param bloco9 the bloco9 to set
	 */
	public void setBloco9(Bloco9 bloco9) {
		this.bloco9 = bloco9;
	}
	/**
	 * @return the blocoC
	 */
	public BlocoC getBlocoC() {
		return blocoC;
	}
	/**
	 * @param blocoC the blocoC to set
	 */
	public void setBlocoC(BlocoC blocoC) {
		this.blocoC = blocoC;
	}
	/**
	 * @return the blocoD
	 */
	public BlocoD getBlocoD() {
		return blocoD;
	}
	/**
	 * @param blocoD the blocoD to set
	 */
	public void setBlocoD(BlocoD blocoD) {
		this.blocoD = blocoD;
	}
	/**
	 * @return the blocoE
	 */
	public BlocoE getBlocoE() {
		return blocoE;
	}
	/**
	 * @param blocoE the blocoE to set
	 */
	public void setBlocoE(BlocoE blocoE) {
		this.blocoE = blocoE;
	}
	/**
	 * @return the blocoG
	 */
	public BlocoG getBlocoG() {
		return blocoG;
	}
	/**
	 * @param blocoG the blocoG to set
	 */
	public void setBlocoG(BlocoG blocoG) {
		this.blocoG = blocoG;
	}
	/**
	 * @return the blocoH
	 */
	public BlocoH getBlocoH() {
		return blocoH;
	}
	/**
	 * @param blocoH the blocoH to set
	 */
	public void setBlocoH(BlocoH blocoH) {
		this.blocoH = blocoH;
	}
	/**
	 * @return the blocoK
	 */
	public BlocoK getBlocoK() {
		return blocoK;
	}
	/**
	 * @param blocoK the blocoK to set
	 */
	public void setBlocoK(BlocoK blocoK) {
		this.blocoK = blocoK;
	}

	/**
	 * @return the contadores
	 */
	public ContadoresBloco0 getContadoresBloco0() {
		return contadoresBloco0;
	}

	/**
	 * @return the contadoresBlocoC
	 */
	public ContadoresBlocoC getContadoresBlocoC() {
		return contadoresBlocoC;
	}

	/**
	 * @return the contadoresBlocoD
	 */
	public ContadoresBlocoD getContadoresBlocoD() {
		return contadoresBlocoD;
	}

	/**
	 * @return the contadoresBlocoE
	 */
	public ContadoresBlocoE getContadoresBlocoE() {
		return contadoresBlocoE;
	}

	/**
	 * @return the contadoresBlocoG
	 */
	public ContadoresBlocoG getContadoresBlocoG() {
		return contadoresBlocoG;
	}

	/**
	 * @return the contadoresBlocoH
	 */
	public ContadoresBlocoH getContadoresBlocoH() {
		return contadoresBlocoH;
	}

	/**
	 * @return the contadoresBlocoK
	 */
	public ContadoresBlocoK getContadoresBlocoK() {
		return contadoresBlocoK;
	}

	/**
	 * @return the contadoresBloco1
	 */
	public ContadoresBloco1 getContadoresBloco1() {
		return contadoresBloco1;
	}

}
