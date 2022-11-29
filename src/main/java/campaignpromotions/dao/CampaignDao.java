package campaignpromotions.dao;

import campaignpromotions.models.entities.Campaigns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignDao extends JpaRepository<Campaigns, Long> {
}
