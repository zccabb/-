package SimpleFactoryModel.Calculator;

public class Operation {
    private double _numberA=0;
    private double _numberB=0;
    private double _result=0;
    public double get_numberA() {
        return _numberA;
    }
    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }
    public double get_numberB() {
        return _numberB;
    }
    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }
    public double get_result() {
        return _result;
    }
    public void set_result(double _result) {
        this._result = _result;
    }

    public double GetResult(){
        return _result;
    }
}
