package com.ffcs.demo.dao;

import com.ffcs.demo.domain.GoodsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hemb on 2020/8/2.
 */
@Repository
public interface GoodsInfoDao extends JpaRepository<GoodsInfo,Integer> {
}
