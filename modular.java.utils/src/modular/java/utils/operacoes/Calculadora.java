package modular.java.utils.operacoes;

import modular.java.utils.operacoes.internal.MultiHelper;
import modular.java.utils.operacoes.internal.SubHelper;
import modular.java.utils.operacoes.internal.SumHelper;
import modular.java.utils.operacoes.internal.DivHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultiHelper multiHelper;

    public Calculadora() {
        this.divHelper = new DivHelper();
        this.multiHelper = new MultiHelper();
        this.subHelper = new SubHelper();
        this.sumHelper = new SumHelper();
    }

    private SubHelper subHelper;
    private SumHelper sumHelper;


    public int sum(int a, int b) {
        return this.sumHelper.execute(a, b);
    }
    public int sub(int a, int b) {
        return this.subHelper.execute(a, b);
    }
    public int div(int a, int b) {
        return this.divHelper.execute(a, b);
    }
    public int multi(int a, int b) {
        return this.multiHelper.execute(a, b);
    }
}
