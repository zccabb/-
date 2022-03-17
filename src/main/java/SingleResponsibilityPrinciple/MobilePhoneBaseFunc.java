package SingleResponsibilityPrinciple;
/**
 * @Author: zcc
 * @Created_on: 2022/3/8/13:04
 * ./MoblicPhone.java
 */
import lombok.Data;
@Data

public class MobilePhoneBaseFunc implements IMobilePhoneBaseFunc {

    //手机充电接口
    @Override
    public void Charging(ElectricSource oElectricsource){

    }
    //打电话
    @Override
    public void RingUp(){

    }
    //接电话
    @Override
    public void ReceiveUp(){

    }
    //上网
    @Override
    public void SurfInternet(){

    }
    //移动办公
    public void MobileOA(){

    }
}
