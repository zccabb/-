package SingleResponsibilityPrinciple;

import jdk.jfr.SettingDefinition;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/12:49
 * ./IMobilePhone.java
 */

public interface IMobilePhoneBaseFunc {

    //手机充电接口
    void Charging(ElectricSource oElectricsource);

    //打电话
    void RingUp();

    //接电话
    void ReceiveUp();

    //上网
    void SurfInternet();

    //移动办公
    void MobileOA();
}
