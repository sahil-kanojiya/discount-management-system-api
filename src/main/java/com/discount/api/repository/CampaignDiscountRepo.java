package com.discount.api.repository;

import com.discount.api.model.CampaignDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignDiscountRepo extends JpaRepository<CampaignDiscount,Integer> { }