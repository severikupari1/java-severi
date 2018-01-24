/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viikko5.tehtava2;

/**
 *
 * @author s704383
 */
public class Ase {
    
        private Bonus bonus;
        private Vahinko vahinko;
        private Asetyyppi asetyyppi;

    public Ase(Bonus bonus, Vahinko vahinko, Asetyyppi asetyyppi) {
        this.bonus = bonus;
        this.vahinko = vahinko;
        this.asetyyppi = asetyyppi;
    }

    
    
  	public enum Bonus {
		BONUSLIEVÄ(10), BONUSKESKI(50), BONUSKOVA(100);
		private final int bonus;
 
		private Bonus(int bonus) {
			this.bonus = bonus;
		}
	}
    
    
    public enum Vahinko{
        mieto(10),
        keskikova(50),
        kova(100);        
        private final int vahinko;
        private Vahinko(int vahinko) {
        this.vahinko = vahinko;
        }    
    }
    
    public enum Asetyyppi{
        miekka,
        tiirikka,
        taikasauva
    }

    /**
     * @return the bonus
     */
    public Bonus getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the vahinko
     */
    public Vahinko getVahinko() {
        return vahinko;
    }

    /**
     * @param vahinko the vahinko to set
     */
    public void setVahinko(Vahinko vahinko) {
        this.vahinko = vahinko;
    }

    /**
     * @return the asetyyppi
     */
    public Asetyyppi getAsetyyppi() {
        return asetyyppi;
    }

    /**
     * @param asetyyppi the asetyyppi to set
     */
    public void setAsetyyppi(Asetyyppi asetyyppi) {
        this.asetyyppi = asetyyppi;
    }

  
}
