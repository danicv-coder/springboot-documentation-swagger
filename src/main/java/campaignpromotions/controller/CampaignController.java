package campaignpromotions.controller;

import campaignpromotions.models.entities.Campaigns;
import campaignpromotions.service.CampaignPriceService;
import campaignpromotions.service.CampaignService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("campaign")
public class CampaignController {

    private final CampaignService campaignService;
    private final CampaignPriceService campaignPriceService;

    public CampaignController(@Qualifier("campaignServiceImpl") CampaignService campaignService,
                              @Qualifier("campaignPriceServiceImpl") CampaignPriceService campaignPriceService) {
        this.campaignService = campaignService;
        this.campaignPriceService = campaignPriceService;
    }

    @GetMapping("/precios")
    @ResponseStatus(HttpStatus.OK)
    public List<Campaigns> listPrice() {
        return campaignService.findAll();
    }

    @PostMapping("campaign")
    @ResponseStatus(HttpStatus.OK)
    public Campaigns campaigns(@RequestBody Integer cantUsuario) {
        return campaignPriceService.getCampaignPrice(cantUsuario);
    }
}
