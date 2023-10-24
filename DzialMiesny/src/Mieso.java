public class Mieso {
    private String typmiesa;
    private float waga;
    private String pochodzeniemiesa;
    private int iloscmiesanastanie;

    public Mieso(String typmiesa, float waga, String pochodzeniemiesa, int iloscmiesanastanie) {
        this.typmiesa = typmiesa;
        this.waga = waga;
        this.pochodzeniemiesa = pochodzeniemiesa;
        this.iloscmiesanastanie = iloscmiesanastanie;
    }

    public String getTypmiesa() {
        return typmiesa;
    }

    public void setTypmiesa(String typmiesa) {
        this.typmiesa = typmiesa;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public String getPochodzeniemiesa() {
        return pochodzeniemiesa;
    }

    public void setPochodzeniemiesa(String pochodzeniemiesa) {
        this.pochodzeniemiesa = pochodzeniemiesa;
    }

    public int getIloscmiesanastanie() {
        return iloscmiesanastanie;
    }

    public void setIloscmiesanastanie(int iloscmiesanastanie) {
        this.iloscmiesanastanie = iloscmiesanastanie;
    }
}
