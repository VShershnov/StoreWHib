/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD.Goods.entity;

/**
 *
 * @author user
 */
public class Goods {
    private Long goodsId;
    private String goodsName;

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }
    
    
}
