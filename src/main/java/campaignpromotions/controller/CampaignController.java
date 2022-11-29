package campaignpromotions.controller;

import campaignpromotions.models.entities.Campaigns;
import campaignpromotions.service.CampaignService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("campaign")
public class CampaignController {

    private final CampaignService campaignService;

    public CampaignController(@Qualifier("campaignServiceImpl") CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping("precios")
    @ResponseStatus(HttpStatus.OK)
    public List<Campaigns> listPrice() {
        return campaignService.findAll();
    }
}
