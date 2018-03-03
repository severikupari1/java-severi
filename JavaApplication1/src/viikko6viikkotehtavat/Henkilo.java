/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

/**
 *
 * @author vtkinju
 */
public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private int ika;
    private String siviilisaaty;
    private boolean toissa;
    private String sukupuoli;

    public Henkilo(String etunimi, String sukunimi, int ika, String siviilisaaty, boolean toissa, String sukupuoli) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
        this.siviilisaaty = siviilisaaty;
        this.toissa = toissa;
        this.sukupuoli = sukupuoli;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public String getSiviilisaaty() {
        return siviilisaaty;
    }

    public void setSiviilisaaty(String siviilisaaty) {
        this.siviilisaaty = siviilisaaty;
    }

    public boolean isToissa() {
        return toissa;
    }

    public void setToissa(boolean toissa) {
        this.toissa = toissa;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    @Override
    public String toString() {
        return "Henkilo{" + "etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", ika=" + ika + ", siviilisaaty=" + siviilisaaty + ", toissa=" + toissa + ", sukupuoli=" + sukupuoli + '}';
    }
    
    
}
