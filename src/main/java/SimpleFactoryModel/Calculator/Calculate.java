package SimpleFactoryModel.Calculator;

public class Calculate extends Operation{
    public static class OperationAdd extends Operation{
        @Override
        public double GetResult(){
            return get_numberA()+get_numberB();
        }
    }
    public static class OperationSub extends Operation{
        @Override
        public double GetResult(){
            return get_numberA()+get_numberB();
        }
    }
    public static class OperationMul extends Operation{
        @Override
        public double GetResult(){
            return get_numberA()*get_numberB();
        }
    }
    public static class OperationDiv extends Operation{
        @Override
        public  double GetResult(){
            if(get_numberB()==0)
                try {
                    throw new Exception("除数不能为0./n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            return  get_numberA()/get_numberB();
        }
    }
    public void OperationAdd(){
        super.set_result(super.get_numberA()+super.get_numberB());
    }
    public void OperationSub(){
        super.set_result(super.get_numberA()-super.get_numberB());
    }
    public void OperationMul(){
        super.set_result(super.get_numberA()*super.get_numberB());
    }
    public void OperationDiv(){
        if(super.get_numberB()==0)
            try {
                throw new Exception("除数不能为0./n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        super.set_result(super.get_numberA()/super.get_numberB());
    }
}
