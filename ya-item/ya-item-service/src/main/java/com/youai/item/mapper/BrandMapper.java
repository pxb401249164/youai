package com.youai.item.mapper;

import com.youai.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author: HuYi.Zhang
 * @create: 2018-05-28 09:59
 **/
public interface BrandMapper extends Mapper<Brand> {

    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid}, #{bid})")
    void insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);

    @Select("select b.* from tb_brand b inner join tb_categroy_brand cd on b.id = cd.brand_id where cd .category_id = #cid")
    List<Brand> selectBrandByCid(Long cid);

}
