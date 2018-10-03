package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;
import org.springframework.stereotype.Service;

/**
 * Created by tony on 03/10/2018.
 */
@Service("iCartService")
public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> update(Integer userId,Integer productId,Integer count);

    ServerResponse<CartVo> deleteProduct(Integer userId,String productIds);

    ServerResponse<CartVo> list (Integer userId);

    ServerResponse<CartVo> selectOrUnSelect (Integer userId,Integer productId,Integer checked);

    ServerResponse<Integer> getCartProductCount(Integer userId);


}
