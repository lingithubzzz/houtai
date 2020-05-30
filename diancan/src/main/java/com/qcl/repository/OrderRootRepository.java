package com.qcl.repository;

import com.qcl.bean.WxOrderRoot;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**

 */
public interface OrderRootRepository extends JpaRepository<WxOrderRoot, Integer> {

    Page<WxOrderRoot> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

    List<WxOrderRoot> findByBuyerOpenidAndOrderStatus(String buyerOpenid, Integer orderStatus);

    List<WxOrderRoot> findAll(Specification specification);
}
