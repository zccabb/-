package SingleResponsibilityPrinciple;
/**
 * @Author: zcc
 * @Created_on: 2022/3/8/14:14
 * ./HuaweiMobile.java
 */
////具体的手机实例
public class HuaweiMobile {
    private IMobilePhoneBaseProperty m_Property;
    private IMobilePhoneBaseFunc m_Func;
    public HuaweiMobile(IMobilePhoneBaseProperty oProperty, IMobilePhoneBaseFunc oFunc)
    {
        m_Property = oProperty;
        m_Func = oFunc;
    }
}
