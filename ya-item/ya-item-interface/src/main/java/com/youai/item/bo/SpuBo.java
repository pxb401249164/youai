package com.youai.item.bo;

import com.youai.item.pojo.Sku;
import com.youai.item.pojo.Spu;
import com.youai.item.pojo.SpuDetail;

import java.util.List;

/**
 * @date 2019/11/25-11:08
 */
public class SpuBo extends Spu {
    String cname;// 商品分类名称

    String bname;// 品牌名称

    SpuDetail spuDetail;// 商品详情

    List<Sku> skus;// sku列表

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public SpuDetail getSpuDetail() {
        return spuDetail;
    }

    public void setSpuDetail(SpuDetail spuDetail) {
        this.spuDetail = spuDetail;
    }

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }
}
