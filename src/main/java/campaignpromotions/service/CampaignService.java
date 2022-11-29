package campaignpromotions.service;

import campaignpromotions.models.entities.Campaigns;

import java.util.List;

public interface CampaignService {
    List<Campaigns> findAll();
}
