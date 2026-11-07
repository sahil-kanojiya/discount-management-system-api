package com.discount.api.service.impl;


import com.discount.api.model.Campaign;
import com.discount.api.repository.CampaignDiscountRepo;
import com.discount.api.repository.CampaignRepo;
import com.discount.api.service.CampaignService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CampaignServiceImpl implements CampaignService {

    private final CampaignRepo campaignRepo;
    private final CampaignDiscountRepo campaignDiscountRepo;

    @Override
    public Campaign addCampaign(Campaign campaign) {
        return campaignRepo.save(campaign);
    }

    @Override
    public List<Campaign> getCampaignBasedOnDate(LocalDate date) {
        return campaignRepo.getTodayCampaign(date);
    }

    @Override
    public List<Campaign> getCampaignBasedOnEndDate(LocalDate date) {
        return campaignRepo.getEndCampaign(date);
    }

}
