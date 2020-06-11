package Sumin.lesson14;

public class Cookie<X, Y> {
    public X best;
    public Y worst;

    public Cookie(X best, Y worst) {
        this.best = best;
        this.worst = worst;
    }

    public X getBest() {
        return best;
    }

    public void setBest(X best) {
        this.best = best;
    }

    public Y getWorst() {
        return worst;
    }

    public void setWorst(Y worst) {
        this.worst = worst;
    }

    public void Print (X best, Y worst){
        System.out.println(best);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
