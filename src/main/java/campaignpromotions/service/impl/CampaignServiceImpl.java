package campaignpromotions.service.impl;

import campaignpromotions.dao.CampaignDao;
import campaignpromotions.models.entities.Campaigns;
import campaignpromotions.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("campaignServiceImpl")
public class CampaignServiceImpl implements CampaignService {
    @Autowired
    CampaignDao campaignDao;

    @Override
    public List<Campaigns> findAll() {
        return campaignDao.findAll();
    }
}
