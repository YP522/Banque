package src.main.banque;

public interface ICompteRemunere {
    public abstract double calculerInterets();

    public abstract void verserInterets();

    public abstract double getTaux();

    public abstract void setTaux(double taux);
}