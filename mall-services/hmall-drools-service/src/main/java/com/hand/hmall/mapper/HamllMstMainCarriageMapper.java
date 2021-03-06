package com.hand.hmall.mapper;

import com.hand.hmall.dto.HamllMstMainCarriage;
import tk.mybatis.mapper.common.Mapper;

public interface HamllMstMainCarriageMapper extends Mapper<HamllMstMainCarriage> {

    /**
     * 根据citycode，shiptype获取mainCarriage
     *
     * @mbggenerated 2017-06-28
     */
    HamllMstMainCarriage selectByCityCodeAndShipType(String code, String shipType, String status);


}