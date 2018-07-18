package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17001227 on 18/7/2018.
 */

public class Formula {

    private String mathTitle;
    private String mathFormula;
    private String mathType;

    public Formula(String mathTitle, String mathFormula, String mathType) {
        this.mathTitle = mathTitle;
        this.mathFormula = mathFormula;
        this.mathType = mathType;
    }

    public String getMathTitle() {
        return mathTitle;
    }

    public void setMathTitle(String mathTitle) {
        this.mathTitle = mathTitle;
    }

    public String getMathFormula() {
        return mathFormula;
    }

    public void setMathFormula(String mathFormula) {
        this.mathFormula = mathFormula;
    }

    public String getMathType() {
        return mathType;
    }

    public void setMathType(String mathType) {
        this.mathType = mathType;
    }

    @Override
    public String toString() {
        return "Formula{" +
                "mathTitle='" + mathTitle + '\'' +
                ", mathFormula='" + mathFormula + '\'' +
                ", mathType='" + mathType + '\'' +
                '}';
    }
}
