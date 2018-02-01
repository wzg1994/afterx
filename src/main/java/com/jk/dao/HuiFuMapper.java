package com.jk.dao;

import com.jk.pojo.Employee;
import com.jk.pojo.HuiFu;

import java.util.List;

public interface HuiFuMapper {
    int insertAdds(HuiFu a);

    void deleteHuiFu(String sss);

    List<Employee> ZhiPais();

    int upzhipais(Integer c);

    List<Employee> CheZhis();

    int upCheZhis(Employee c);
}