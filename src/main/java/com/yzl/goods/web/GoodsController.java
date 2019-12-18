package com.yzl.goods.web;

import com.yzl.goods.dao.GoodsDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjingjia  on 2019/12/13.
 */
@RestController
@RequestMapping("/goods")
@Api(value="商品",description = "商品操作API",position = 100,protocols = "http ")
public class GoodsController {
    @Autowired
    private GoodsDao goodsDao;

    @ApiOperation(
            value = "查询所有商品",
            notes = "完整的商品列表",
            produces="application/json, application/xml",
            consumes="application/json, application/xml",
            response = ResponseEntity.class
    )
   @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(goodsDao.findAll(), HttpStatus.OK);
    }
    @ApiOperation(
            value = "根据ID查询商品",
            notes = "商品",
            produces="application/json, application/xml",
            consumes="application/json, application/xml",
            response = ResponseEntity.class
    )
    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findById(int id){
        return new ResponseEntity<>(goodsDao.findById(id), HttpStatus.OK);
    }
}
