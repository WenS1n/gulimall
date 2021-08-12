package cn.vesns.gulimall.product;

import cn.vesns.gulimall.product.entity.CategoryBrandRelationEntity;
import cn.vesns.gulimall.product.service.CategoryBrandRelationService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    CategoryBrandRelationService brandRelationService;

    @Test
    void contextLoads() {
        CategoryBrandRelationEntity brandRelation = new CategoryBrandRelationEntity();
//        brandRelation.setId(1L);
//        brandRelation.setBrandName("apple2");
//        brandRelation.setCatelogName("12");

//        brandRelationService.updateById(brandRelation);

        List<CategoryBrandRelationEntity> list = brandRelationService.list(new QueryWrapper<CategoryBrandRelationEntity>().eq("brand_id", 1L));

        list.forEach((item) -> {
            System.out.println(item + "------------");
        });

    }

}
