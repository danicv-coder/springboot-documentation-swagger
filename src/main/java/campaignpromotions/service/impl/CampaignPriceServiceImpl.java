package campaignpromotions.service.impl;

import campaignpromotions.models.entities.Campaigns;
import campaignpromotions.service.CampaignPriceService;
import campaignpromotions.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("campaignPriceServiceImpl")
public class CampaignPriceServiceImpl implements CampaignPriceService {
    @Autowired
    CampaignService campaignService;

    @Override
    public Campaigns getCampaignPrice(Integer cantUsuario) {
        Campaigns campaigns1 = new Campaigns();
        for (Campaigns campaigns : campaignService.findAll()) {
            if (cantUsuario <= 5 || cantUsuario >= 100) {
                campaigns1.setName(campaigns.getName());
                campaigns1.setPrice(campaigns.getPrice());
                campaigns1.setRangerInitial(campaigns.getRangerInitial());
                campaigns1.setRangerFinal(campaigns.getRangerFinal());
            }
        }
        return campaigns1;
    }
}
