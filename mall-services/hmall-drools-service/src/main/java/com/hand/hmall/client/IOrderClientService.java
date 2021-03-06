package com.hand.hmall.client;

import com.hand.hmall.client.impl.PromoteClientServiceImpl;
import com.hand.hmall.dto.ResponseData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by shanks on 2017/2/14.
 * 调用订单微服务
 */
@FeignClient(value = "hmall-od-service", fallback = PromoteClientServiceImpl.class)
public interface IOrderClientService  {
    /**
     * 订单微服务无对应方法，方法已过期
     *
     * @param tempIds
     * @return
     */
    @RequestMapping(value = "/order/queryForTempOrders", method = RequestMethod.POST)
    public ResponseData queryForTempOrders(@RequestBody List<String> tempIds);
}
